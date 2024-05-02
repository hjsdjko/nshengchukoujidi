package com.entity.view;

import com.entity.JidichanpinLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 基地产品留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidichanpin_liuyan")
public class JidichanpinLiuyanView extends JidichanpinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jidichanpin
			/**
			* 名称
			*/
			private String jidichanpinName;
			/**
			* 类型
			*/
			private Integer jidichanpinTypes;
				/**
				* 类型的值
				*/
				private String jidichanpinValue;
			/**
			* 图片
			*/
			private String jidichanpinPhoto;
			/**
			* 介绍
			*/
			private String jidichanpinContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 身份
			*/
			private String role;

	public JidichanpinLiuyanView() {

	}

	public JidichanpinLiuyanView(JidichanpinLiuyanEntity jidichanpinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jidichanpinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set jidichanpin
					/**
					* 获取： 名称
					*/
					public String getJidichanpinName() {
						return jidichanpinName;
					}
					/**
					* 设置： 名称
					*/
					public void setJidichanpinName(String jidichanpinName) {
						this.jidichanpinName = jidichanpinName;
					}
					/**
					* 获取： 类型
					*/
					public Integer getJidichanpinTypes() {
						return jidichanpinTypes;
					}
					/**
					* 设置： 类型
					*/
					public void setJidichanpinTypes(Integer jidichanpinTypes) {
						this.jidichanpinTypes = jidichanpinTypes;
					}


						/**
						* 获取： 类型的值
						*/
						public String getJidichanpinValue() {
							return jidichanpinValue;
						}
						/**
						* 设置： 类型的值
						*/
						public void setJidichanpinValue(String jidichanpinValue) {
							this.jidichanpinValue = jidichanpinValue;
						}
					/**
					* 获取： 图片
					*/
					public String getJidichanpinPhoto() {
						return jidichanpinPhoto;
					}
					/**
					* 设置： 图片
					*/
					public void setJidichanpinPhoto(String jidichanpinPhoto) {
						this.jidichanpinPhoto = jidichanpinPhoto;
					}
					/**
					* 获取： 介绍
					*/
					public String getJidichanpinContent() {
						return jidichanpinContent;
					}
					/**
					* 设置： 介绍
					*/
					public void setJidichanpinContent(String jidichanpinContent) {
						this.jidichanpinContent = jidichanpinContent;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 身份
					*/
					public String getRole() {
						return role;
					}
					/**
					* 设置： 身份
					*/
					public void setRole(String role) {
						this.role = role;
					}









}
