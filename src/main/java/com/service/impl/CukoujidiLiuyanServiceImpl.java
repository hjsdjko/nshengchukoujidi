package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.CukoujidiLiuyanDao;
import com.entity.CukoujidiLiuyanEntity;
import com.service.CukoujidiLiuyanService;
import com.entity.view.CukoujidiLiuyanView;

/**
 * 出口基地留言 服务实现类
 * @author 
 * @since 2021-04-19
 */
@Service("cukoujidiLiuyanService")
@Transactional
public class CukoujidiLiuyanServiceImpl extends ServiceImpl<CukoujidiLiuyanDao, CukoujidiLiuyanEntity> implements CukoujidiLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CukoujidiLiuyanView> page =new Query<CukoujidiLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
