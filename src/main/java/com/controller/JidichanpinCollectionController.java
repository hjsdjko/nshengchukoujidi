package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.JidichanpinCollectionEntity;

import com.service.JidichanpinCollectionService;
import com.entity.view.JidichanpinCollectionView;
import com.service.JidichanpinService;
import com.entity.JidichanpinEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 基地产品收藏
 * 后端接口
 * @author
 * @email
 * @date 2021-04-19
*/
@RestController
@Controller
@RequestMapping("/jidichanpinCollection")
public class JidichanpinCollectionController {
    private static final Logger logger = LoggerFactory.getLogger(JidichanpinCollectionController.class);

    @Autowired
    private JidichanpinCollectionService jidichanpinCollectionService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private JidichanpinService jidichanpinService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = jidichanpinCollectionService.queryPage(params);

        //字典表数据转换
        List<JidichanpinCollectionView> list =(List<JidichanpinCollectionView>)page.getList();
        for(JidichanpinCollectionView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JidichanpinCollectionEntity jidichanpinCollection = jidichanpinCollectionService.selectById(id);
        if(jidichanpinCollection !=null){
            //entity转view
            JidichanpinCollectionView view = new JidichanpinCollectionView();
            BeanUtils.copyProperties( jidichanpinCollection , view );//把实体数据重构到view中

            //级联表
            JidichanpinEntity jidichanpin = jidichanpinService.selectById(jidichanpinCollection.getJidichanpinId());
            if(jidichanpin != null){
                BeanUtils.copyProperties( jidichanpin , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setJidichanpinId(jidichanpin.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(jidichanpinCollection.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JidichanpinCollectionEntity jidichanpinCollection, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jidichanpinCollection:{}",this.getClass().getName(),jidichanpinCollection.toString());
        Wrapper<JidichanpinCollectionEntity> queryWrapper = new EntityWrapper<JidichanpinCollectionEntity>()
            .eq("jidichanpin_id", jidichanpinCollection.getJidichanpinId())
            .eq("yonghu_id", jidichanpinCollection.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JidichanpinCollectionEntity jidichanpinCollectionEntity = jidichanpinCollectionService.selectOne(queryWrapper);
        if(jidichanpinCollectionEntity==null){
            jidichanpinCollection.setInsertTime(new Date());
            jidichanpinCollection.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jidichanpinCollection.set
        //  }
            jidichanpinCollectionService.insert(jidichanpinCollection);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JidichanpinCollectionEntity jidichanpinCollection, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jidichanpinCollection:{}",this.getClass().getName(),jidichanpinCollection.toString());
        //根据字段查询是否有相同数据
        Wrapper<JidichanpinCollectionEntity> queryWrapper = new EntityWrapper<JidichanpinCollectionEntity>()
            .notIn("id",jidichanpinCollection.getId())
            .andNew()
            .eq("jidichanpin_id", jidichanpinCollection.getJidichanpinId())
            .eq("yonghu_id", jidichanpinCollection.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JidichanpinCollectionEntity jidichanpinCollectionEntity = jidichanpinCollectionService.selectOne(queryWrapper);
        if(jidichanpinCollectionEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      jidichanpinCollection.set
            //  }
            jidichanpinCollectionService.updateById(jidichanpinCollection);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jidichanpinCollectionService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = jidichanpinCollectionService.queryPage(params);

        //字典表数据转换
        List<JidichanpinCollectionView> list =(List<JidichanpinCollectionView>)page.getList();
        for(JidichanpinCollectionView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JidichanpinCollectionEntity jidichanpinCollection = jidichanpinCollectionService.selectById(id);
            if(jidichanpinCollection !=null){
                //entity转view
        JidichanpinCollectionView view = new JidichanpinCollectionView();
                BeanUtils.copyProperties( jidichanpinCollection , view );//把实体数据重构到view中

                //级联表
                    JidichanpinEntity jidichanpin = jidichanpinService.selectById(jidichanpinCollection.getJidichanpinId());
                if(jidichanpin != null){
                    BeanUtils.copyProperties( jidichanpin , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJidichanpinId(jidichanpin.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(jidichanpinCollection.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JidichanpinCollectionEntity jidichanpinCollection, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jidichanpinCollection:{}",this.getClass().getName(),jidichanpinCollection.toString());
        Wrapper<JidichanpinCollectionEntity> queryWrapper = new EntityWrapper<JidichanpinCollectionEntity>()
            .eq("jidichanpin_id", jidichanpinCollection.getJidichanpinId())
            .eq("yonghu_id", jidichanpinCollection.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    JidichanpinCollectionEntity jidichanpinCollectionEntity = jidichanpinCollectionService.selectOne(queryWrapper);
        if(jidichanpinCollectionEntity==null){
            jidichanpinCollection.setInsertTime(new Date());
            jidichanpinCollection.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jidichanpinCollection.set
        //  }
        jidichanpinCollectionService.insert(jidichanpinCollection);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

