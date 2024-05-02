package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 出口基地
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("cukoujidi")
public class CukoujidiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CukoujidiEntity() {

	}

	public CukoujidiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 名称
     */
    @TableField(value = "cukoujidi_name")

    private String cukoujidiName;


    /**
     * 地址
     */
    @TableField(value = "cukoujidi_dizhi")

    private String cukoujidiDizhi;


    /**
     * 类型
     */
    @TableField(value = "jidiqiye_types")

    private Integer jidiqiyeTypes;


    /**
     * 图片
     */
    @TableField(value = "cukoujidi_photo")

    private String cukoujidiPhoto;


    /**
     * 介绍
     */
    @TableField(value = "cukoujidi_content")

    private String cukoujidiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：名称
	 */
    public String getCukoujidiName() {
        return cukoujidiName;
    }


    /**
	 * 获取：名称
	 */

    public void setCukoujidiName(String cukoujidiName) {
        this.cukoujidiName = cukoujidiName;
    }
    /**
	 * 设置：地址
	 */
    public String getCukoujidiDizhi() {
        return cukoujidiDizhi;
    }


    /**
	 * 获取：地址
	 */

    public void setCukoujidiDizhi(String cukoujidiDizhi) {
        this.cukoujidiDizhi = cukoujidiDizhi;
    }
    /**
	 * 设置：类型
	 */
    public Integer getJidiqiyeTypes() {
        return jidiqiyeTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setJidiqiyeTypes(Integer jidiqiyeTypes) {
        this.jidiqiyeTypes = jidiqiyeTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getCukoujidiPhoto() {
        return cukoujidiPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setCukoujidiPhoto(String cukoujidiPhoto) {
        this.cukoujidiPhoto = cukoujidiPhoto;
    }
    /**
	 * 设置：介绍
	 */
    public String getCukoujidiContent() {
        return cukoujidiContent;
    }


    /**
	 * 获取：介绍
	 */

    public void setCukoujidiContent(String cukoujidiContent) {
        this.cukoujidiContent = cukoujidiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Cukoujidi{" +
            "id=" + id +
            ", cukoujidiName=" + cukoujidiName +
            ", cukoujidiDizhi=" + cukoujidiDizhi +
            ", jidiqiyeTypes=" + jidiqiyeTypes +
            ", cukoujidiPhoto=" + cukoujidiPhoto +
            ", cukoujidiContent=" + cukoujidiContent +
            ", createTime=" + createTime +
        "}";
    }
}
