package com.entity.view;

import com.entity.JidiqiyeCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 基地企业收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidiqiye_collection")
public class JidiqiyeCollectionView extends JidiqiyeCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jidiqiye
			/**
			* 企业名称
			*/
			private String jidiqiyeName;
			/**
			* 企业类型
			*/
			private Integer jidiqiyeTypes;
				/**
				* 企业类型的值
				*/
				private String jidiqiyeValue;
			/**
			* 企业图片
			*/
			private String jidiqiyePhoto;
			/**
			* 企业介绍
			*/
			private String jidiqiyeContent;

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

	public JidiqiyeCollectionView() {

	}

	public JidiqiyeCollectionView(JidiqiyeCollectionEntity jidiqiyeCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, jidiqiyeCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set jidiqiye
					/**
					* 获取： 企业名称
					*/
					public String getJidiqiyeName() {
						return jidiqiyeName;
					}
					/**
					* 设置： 企业名称
					*/
					public void setJidiqiyeName(String jidiqiyeName) {
						this.jidiqiyeName = jidiqiyeName;
					}
					/**
					* 获取： 企业类型
					*/
					public Integer getJidiqiyeTypes() {
						return jidiqiyeTypes;
					}
					/**
					* 设置： 企业类型
					*/
					public void setJidiqiyeTypes(Integer jidiqiyeTypes) {
						this.jidiqiyeTypes = jidiqiyeTypes;
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
					/**
					* 获取： 企业图片
					*/
					public String getJidiqiyePhoto() {
						return jidiqiyePhoto;
					}
					/**
					* 设置： 企业图片
					*/
					public void setJidiqiyePhoto(String jidiqiyePhoto) {
						this.jidiqiyePhoto = jidiqiyePhoto;
					}
					/**
					* 获取： 企业介绍
					*/
					public String getJidiqiyeContent() {
						return jidiqiyeContent;
					}
					/**
					* 设置： 企业介绍
					*/
					public void setJidiqiyeContent(String jidiqiyeContent) {
						this.jidiqiyeContent = jidiqiyeContent;
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
