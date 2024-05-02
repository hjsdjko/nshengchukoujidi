package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CukoujidiCollectionEntity;
import java.util.Map;

/**
 * 出口基地收藏 服务类
 * @author 
 * @since 2021-04-19
 */
public interface CukoujidiCollectionService extends IService<CukoujidiCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}