package com.entity.model;

import com.entity.CukoujidiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出口基地
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class CukoujidiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String cukoujidiName;


    /**
     * 地址
     */
    private String cukoujidiDizhi;


    /**
     * 类型
     */
    private Integer jidiqiyeTypes;


    /**
     * 图片
     */
    private String cukoujidiPhoto;


    /**
     * 介绍
     */
    private String cukoujidiContent;


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
	 * 获取：名称
	 */
    public String getCukoujidiName() {
        return cukoujidiName;
    }


    /**
	 * 设置：名称
	 */
    public void setCukoujidiName(String cukoujidiName) {
        this.cukoujidiName = cukoujidiName;
    }
    /**
	 * 获取：地址
	 */
    public String getCukoujidiDizhi() {
        return cukoujidiDizhi;
    }


    /**
	 * 设置：地址
	 */
    public void setCukoujidiDizhi(String cukoujidiDizhi) {
        this.cukoujidiDizhi = cukoujidiDizhi;
    }
    /**
	 * 获取：类型
	 */
    public Integer getJidiqiyeTypes() {
        return jidiqiyeTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setJidiqiyeTypes(Integer jidiqiyeTypes) {
        this.jidiqiyeTypes = jidiqiyeTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getCukoujidiPhoto() {
        return cukoujidiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setCukoujidiPhoto(String cukoujidiPhoto) {
        this.cukoujidiPhoto = cukoujidiPhoto;
    }
    /**
	 * 获取：介绍
	 */
    public String getCukoujidiContent() {
        return cukoujidiContent;
    }


    /**
	 * 设置：介绍
	 */
    public void setCukoujidiContent(String cukoujidiContent) {
        this.cukoujidiContent = cukoujidiContent;
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
