package com.dao;

import com.entity.JidichanpinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JidichanpinLiuyanView;

/**
 * 基地产品留言 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface JidichanpinLiuyanDao extends BaseMapper<JidichanpinLiuyanEntity> {

   List<JidichanpinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
