package com.entity.model;

import com.entity.JidichanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 基地产品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class JidichanpinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 名称
     */
    private String jidichanpinName;


    /**
     * 类型
     */
    private Integer jidichanpinTypes;


    /**
     * 图片
     */
    private String jidichanpinPhoto;


    /**
     * 介绍
     */
    private String jidichanpinContent;


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
    public String getJidichanpinName() {
        return jidichanpinName;
    }


    /**
	 * 设置：名称
	 */
    public void setJidichanpinName(String jidichanpinName) {
        this.jidichanpinName = jidichanpinName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getJidichanpinTypes() {
        return jidichanpinTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setJidichanpinTypes(Integer jidichanpinTypes) {
        this.jidichanpinTypes = jidichanpinTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getJidichanpinPhoto() {
        return jidichanpinPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setJidichanpinPhoto(String jidichanpinPhoto) {
        this.jidichanpinPhoto = jidichanpinPhoto;
    }
    /**
	 * 获取：介绍
	 */
    public String getJidichanpinContent() {
        return jidichanpinContent;
    }


    /**
	 * 设置：介绍
	 */
    public void setJidichanpinContent(String jidichanpinContent) {
        this.jidichanpinContent = jidichanpinContent;
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
