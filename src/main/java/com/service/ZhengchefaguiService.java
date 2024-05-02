package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengchefaguiEntity;
import java.util.Map;

/**
 * 政策法规 服务类
 * @author 
 * @since 2021-04-19
 */
public interface ZhengchefaguiService extends IService<ZhengchefaguiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}