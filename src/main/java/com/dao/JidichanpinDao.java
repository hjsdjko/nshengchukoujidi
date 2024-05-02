package com.dao;

import com.entity.JidichanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JidichanpinView;

/**
 * 基地产品 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface JidichanpinDao extends BaseMapper<JidichanpinEntity> {

   List<JidichanpinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
