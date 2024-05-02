package com.entity.model;

import com.entity.ZhengchefaguiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 政策法规
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class ZhengchefaguiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 政策法规名称
     */
    private String zhengchefaguiName;


    /**
     * 政策法规类型
     */
    private Integer zhengchefaguiTypes;


    /**
     * 政策法规图片
     */
    private String zhengchefaguiPhoto;


    /**
     * 政策法规时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 政策法规详情
     */
    private String zhengchefaguiContent;


    /**
     * 创建时间 show2 show1 nameShow
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
	 * 获取：政策法规名称
	 */
    public String getZhengchefaguiName() {
        return zhengchefaguiName;
    }


    /**
	 * 设置：政策法规名称
	 */
    public void setZhengchefaguiName(String zhengchefaguiName) {
        this.zhengchefaguiName = zhengchefaguiName;
    }
    /**
	 * 获取：政策法规类型
	 */
    public Integer getZhengchefaguiTypes() {
        return zhengchefaguiTypes;
    }


    /**
	 * 设置：政策法规类型
	 */
    public void setZhengchefaguiTypes(Integer zhengchefaguiTypes) {
        this.zhengchefaguiTypes = zhengchefaguiTypes;
    }
    /**
	 * 获取：政策法规图片
	 */
    public String getZhengchefaguiPhoto() {
        return zhengchefaguiPhoto;
    }


    /**
	 * 设置：政策法规图片
	 */
    public void setZhengchefaguiPhoto(String zhengchefaguiPhoto) {
        this.zhengchefaguiPhoto = zhengchefaguiPhoto;
    }
    /**
	 * 获取：政策法规时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：政策法规时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：政策法规详情
	 */
    public String getZhengchefaguiContent() {
        return zhengchefaguiContent;
    }


    /**
	 * 设置：政策法规详情
	 */
    public void setZhengchefaguiContent(String zhengchefaguiContent) {
        this.zhengchefaguiContent = zhengchefaguiContent;
    }
    /**
	 * 获取：创建时间 show2 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 show1 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
