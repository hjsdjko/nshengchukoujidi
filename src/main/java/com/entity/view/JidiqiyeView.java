package com.entity.view;

import com.entity.JidiqiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 基地企业
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidiqiye")
public class JidiqiyeView extends JidiqiyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 企业类型的值
		*/
		private String jidiqiyeValue;



	public JidiqiyeView() {

	}

	public JidiqiyeView(JidiqiyeEntity jidiqiyeEntity) {
		try {
			BeanUtils.copyProperties(this, jidiqiyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 企业类型的值
			*/
			public String getJidiqiyeValue() {
				return jidiqiyeValue;
			}
			/**
			* 设置： 企业类型的值
			*/
			public void setJidiqiyeValue(String jidiqiyeValue) {
				this.jidiqiyeValue = jidiqiyeValue;
			}
















}
