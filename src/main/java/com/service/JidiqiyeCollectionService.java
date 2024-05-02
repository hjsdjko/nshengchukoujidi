package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JidiqiyeCollectionEntity;
import java.util.Map;

/**
 * 基地企业收藏 服务类
 * @author 
 * @since 2021-04-19
 */
public interface JidiqiyeCollectionService extends IService<JidiqiyeCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}