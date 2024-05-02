package com.entity.model;

import com.entity.JidiqiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 基地企业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class JidiqiyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 企业名称
     */
    private String jidiqiyeName;


    /**
     * 企业类型
     */
    private Integer jidiqiyeTypes;


    /**
     * 企业图片
     */
    private String jidiqiyePhoto;


    /**
     * 企业介绍
     */
    private String jidiqiyeContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：企业名称
	 */
    public String getJidiqiyeName() {
        return jidiqiyeName;
    }


    /**
	 * 设置：企业名称
	 */
    public void setJidiqiyeName(String jidiqiyeName) {
        this.jidiqiyeName = jidiqiyeName;
    }
    /**
	 * 获取：企业类型
	 */
    public Integer getJidiqiyeTypes() {
        return jidiqiyeTypes;
    }


    /**
	 * 设置：企业类型
	 */
    public void setJidiqiyeTypes(Integer jidiqiyeTypes) {
        this.jidiqiyeTypes = jidiqiyeTypes;
    }
    /**
	 * 获取：企业图片
	 */
    public String getJidiqiyePhoto() {
        return jidiqiyePhoto;
    }


    /**
	 * 设置：企业图片
	 */
    public void setJidiqiyePhoto(String jidiqiyePhoto) {
        this.jidiqiyePhoto = jidiqiyePhoto;
    }
    /**
	 * 获取：企业介绍
	 */
    public String getJidiqiyeContent() {
        return jidiqiyeContent;
    }


    /**
	 * 设置：企业介绍
	 */
    public void setJidiqiyeContent(String jidiqiyeContent) {
        this.jidiqiyeContent = jidiqiyeContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
