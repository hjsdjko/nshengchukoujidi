package com.dao;

import com.entity.ZhixundongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhixundongtaiView;

/**
 * 资讯动态 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface ZhixundongtaiDao extends BaseMapper<ZhixundongtaiEntity> {

   List<ZhixundongtaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
