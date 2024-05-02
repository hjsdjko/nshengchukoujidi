package com.entity.view;

import com.entity.ZhixundongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 资讯动态
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("zhixundongtai")
public class ZhixundongtaiView extends ZhixundongtaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 资讯动态类型的值
		*/
		private String zhixundongtaiValue;



	public ZhixundongtaiView() {

	}

	public ZhixundongtaiView(ZhixundongtaiEntity zhixundongtaiEntity) {
		try {
			BeanUtils.copyProperties(this, zhixundongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 资讯动态类型的值
			*/
			public String getZhixundongtaiValue() {
				return zhixundongtaiValue;
			}
			/**
			* 设置： 资讯动态类型的值
			*/
			public void setZhixundongtaiValue(String zhixundongtaiValue) {
				this.zhixundongtaiValue = zhixundongtaiValue;
			}
















}
