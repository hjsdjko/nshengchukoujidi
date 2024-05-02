package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhixundongtaiEntity;
import java.util.Map;

/**
 * 资讯动态 服务类
 * @author 
 * @since 2021-04-19
 */
public interface ZhixundongtaiService extends IService<ZhixundongtaiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}