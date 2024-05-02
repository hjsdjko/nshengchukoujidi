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
 * 基地企业
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidiqiye")
public class JidiqiyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JidiqiyeEntity() {

	}

	public JidiqiyeEntity(T t) {
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
     * 企业名称
     */
    @TableField(value = "jidiqiye_name")

    private String jidiqiyeName;


    /**
     * 企业类型
     */
    @TableField(value = "jidiqiye_types")

    private Integer jidiqiyeTypes;


    /**
     * 企业图片
     */
    @TableField(value = "jidiqiye_photo")

    private String jidiqiyePhoto;


    /**
     * 企业介绍
     */
    @TableField(value = "jidiqiye_content")

    private String jidiqiyeContent;


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
	 * 设置：企业名称
	 */
    public String getJidiqiyeName() {
        return jidiqiyeName;
    }


    /**
	 * 获取：企业名称
	 */

    public void setJidiqiyeName(String jidiqiyeName) {
        this.jidiqiyeName = jidiqiyeName;
    }
    /**
	 * 设置：企业类型
	 */
    public Integer getJidiqiyeTypes() {
        return jidiqiyeTypes;
    }


    /**
	 * 获取：企业类型
	 */

    public void setJidiqiyeTypes(Integer jidiqiyeTypes) {
        this.jidiqiyeTypes = jidiqiyeTypes;
    }
    /**
	 * 设置：企业图片
	 */
    public String getJidiqiyePhoto() {
        return jidiqiyePhoto;
    }


    /**
	 * 获取：企业图片
	 */

    public void setJidiqiyePhoto(String jidiqiyePhoto) {
        this.jidiqiyePhoto = jidiqiyePhoto;
    }
    /**
	 * 设置：企业介绍
	 */
    public String getJidiqiyeContent() {
        return jidiqiyeContent;
    }


    /**
	 * 获取：企业介绍
	 */

    public void setJidiqiyeContent(String jidiqiyeContent) {
        this.jidiqiyeContent = jidiqiyeContent;
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
        return "Jidiqiye{" +
            "id=" + id +
            ", jidiqiyeName=" + jidiqiyeName +
            ", jidiqiyeTypes=" + jidiqiyeTypes +
            ", jidiqiyePhoto=" + jidiqiyePhoto +
            ", jidiqiyeContent=" + jidiqiyeContent +
            ", createTime=" + createTime +
        "}";
    }
}
