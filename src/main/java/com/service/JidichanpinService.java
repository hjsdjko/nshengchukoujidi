package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JidichanpinEntity;
import java.util.Map;

/**
 * 基地产品 服务类
 * @author 
 * @since 2021-04-19
 */
public interface JidichanpinService extends IService<JidichanpinEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}