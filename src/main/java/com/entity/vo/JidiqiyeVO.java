package com.entity.vo;

import com.entity.JidiqiyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 基地企业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidiqiye")
public class JidiqiyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
