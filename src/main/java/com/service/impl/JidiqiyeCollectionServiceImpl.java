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

import com.dao.JidiqiyeCollectionDao;
import com.entity.JidiqiyeCollectionEntity;
import com.service.JidiqiyeCollectionService;
import com.entity.view.JidiqiyeCollectionView;

/**
 * 基地企业收藏 服务实现类
 * @author 
 * @since 2021-04-19
 */
@Service("jidiqiyeCollectionService")
@Transactional
public class JidiqiyeCollectionServiceImpl extends ServiceImpl<JidiqiyeCollectionDao, JidiqiyeCollectionEntity> implements JidiqiyeCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JidiqiyeCollectionView> page =new Query<JidiqiyeCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
