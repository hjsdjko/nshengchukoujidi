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
 * 基地产品
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidichanpin")
public class JidichanpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JidichanpinEntity() {

	}

	public JidichanpinEntity(T t) {
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
    @TableField(value = "jidichanpin_name")

    private String jidichanpinName;


    /**
     * 类型
     */
    @TableField(value = "jidichanpin_types")

    private Integer jidichanpinTypes;


    /**
     * 图片
     */
    @TableField(value = "jidichanpin_photo")

    private String jidichanpinPhoto;


    /**
     * 介绍
     */
    @TableField(value = "jidichanpin_content")

    private String jidichanpinContent;


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
    public String getJidichanpinName() {
        return jidichanpinName;
    }


    /**
	 * 获取：名称
	 */

    public void setJidichanpinName(String jidichanpinName) {
        this.jidichanpinName = jidichanpinName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getJidichanpinTypes() {
        return jidichanpinTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setJidichanpinTypes(Integer jidichanpinTypes) {
        this.jidichanpinTypes = jidichanpinTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getJidichanpinPhoto() {
        return jidichanpinPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setJidichanpinPhoto(String jidichanpinPhoto) {
        this.jidichanpinPhoto = jidichanpinPhoto;
    }
    /**
	 * 设置：介绍
	 */
    public String getJidichanpinContent() {
        return jidichanpinContent;
    }


    /**
	 * 获取：介绍
	 */

    public void setJidichanpinContent(String jidichanpinContent) {
        this.jidichanpinContent = jidichanpinContent;
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
        return "Jidichanpin{" +
            "id=" + id +
            ", jidichanpinName=" + jidichanpinName +
            ", jidichanpinTypes=" + jidichanpinTypes +
            ", jidichanpinPhoto=" + jidichanpinPhoto +
            ", jidichanpinContent=" + jidichanpinContent +
            ", createTime=" + createTime +
        "}";
    }
}
