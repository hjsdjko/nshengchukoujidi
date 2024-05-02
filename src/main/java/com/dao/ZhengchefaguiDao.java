package com.dao;

import com.entity.ZhengchefaguiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengchefaguiView;

/**
 * 政策法规 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface ZhengchefaguiDao extends BaseMapper<ZhengchefaguiEntity> {

   List<ZhengchefaguiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
