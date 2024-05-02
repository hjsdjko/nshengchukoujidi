package com.dao;

import com.entity.JidiqiyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JidiqiyeView;

/**
 * 基地企业 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface JidiqiyeDao extends BaseMapper<JidiqiyeEntity> {

   List<JidiqiyeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
