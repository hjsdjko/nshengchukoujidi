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
 * 政策法规
 *
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("zhengchefagui")
public class ZhengchefaguiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhengchefaguiEntity() {

	}

	public ZhengchefaguiEntity(T t) {
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
     * 政策法规名称
     */
    @TableField(value = "zhengchefagui_name")

    private String zhengchefaguiName;


    /**
     * 政策法规类型
     */
    @TableField(value = "zhengchefagui_types")

    private Integer zhengchefaguiTypes;


    /**
     * 政策法规图片
     */
    @TableField(value = "zhengchefagui_photo")

    private String zhengchefaguiPhoto;


    /**
     * 政策法规时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 政策法规详情
     */
    @TableField(value = "zhengchefagui_content")

    private String zhengchefaguiContent;


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
	 * 设置：政策法规名称
	 */
    public String getZhengchefaguiName() {
        return zhengchefaguiName;
    }


    /**
	 * 获取：政策法规名称
	 */

    public void setZhengchefaguiName(String zhengchefaguiName) {
        this.zhengchefaguiName = zhengchefaguiName;
    }
    /**
	 * 设置：政策法规类型
	 */
    public Integer getZhengchefaguiTypes() {
        return zhengchefaguiTypes;
    }


    /**
	 * 获取：政策法规类型
	 */

    public void setZhengchefaguiTypes(Integer zhengchefaguiTypes) {
        this.zhengchefaguiTypes = zhengchefaguiTypes;
    }
    /**
	 * 设置：政策法规图片
	 */
    public String getZhengchefaguiPhoto() {
        return zhengchefaguiPhoto;
    }


    /**
	 * 获取：政策法规图片
	 */

    public void setZhengchefaguiPhoto(String zhengchefaguiPhoto) {
        this.zhengchefaguiPhoto = zhengchefaguiPhoto;
    }
    /**
	 * 设置：政策法规时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：政策法规时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：政策法规详情
	 */
    public String getZhengchefaguiContent() {
        return zhengchefaguiContent;
    }


    /**
	 * 获取：政策法规详情
	 */

    public void setZhengchefaguiContent(String zhengchefaguiContent) {
        this.zhengchefaguiContent = zhengchefaguiContent;
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
        return "Zhengchefagui{" +
            "id=" + id +
            ", zhengchefaguiName=" + zhengchefaguiName +
            ", zhengchefaguiTypes=" + zhengchefaguiTypes +
            ", zhengchefaguiPhoto=" + zhengchefaguiPhoto +
            ", insertTime=" + insertTime +
            ", zhengchefaguiContent=" + zhengchefaguiContent +
            ", createTime=" + createTime +
        "}";
    }
}
