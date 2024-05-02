package com.entity.model;

import com.entity.ZhixundongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资讯动态
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-19
 */
public class ZhixundongtaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资讯动态名称
     */
    private String zhixundongtaiName;


    /**
     * 资讯动态类型
     */
    private Integer zhixundongtaiTypes;


    /**
     * 资讯动态图片
     */
    private String zhixundongtaiPhoto;


    /**
     * 资讯动态时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 资讯动态详情
     */
    private String zhixundongtaiContent;


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
	 * 获取：资讯动态名称
	 */
    public String getZhixundongtaiName() {
        return zhixundongtaiName;
    }


    /**
	 * 设置：资讯动态名称
	 */
    public void setZhixundongtaiName(String zhixundongtaiName) {
        this.zhixundongtaiName = zhixundongtaiName;
    }
    /**
	 * 获取：资讯动态类型
	 */
    public Integer getZhixundongtaiTypes() {
        return zhixundongtaiTypes;
    }


    /**
	 * 设置：资讯动态类型
	 */
    public void setZhixundongtaiTypes(Integer zhixundongtaiTypes) {
        this.zhixundongtaiTypes = zhixundongtaiTypes;
    }
    /**
	 * 获取：资讯动态图片
	 */
    public String getZhixundongtaiPhoto() {
        return zhixundongtaiPhoto;
    }


    /**
	 * 设置：资讯动态图片
	 */
    public void setZhixundongtaiPhoto(String zhixundongtaiPhoto) {
        this.zhixundongtaiPhoto = zhixundongtaiPhoto;
    }
    /**
	 * 获取：资讯动态时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：资讯动态时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：资讯动态详情
	 */
    public String getZhixundongtaiContent() {
        return zhixundongtaiContent;
    }


    /**
	 * 设置：资讯动态详情
	 */
    public void setZhixundongtaiContent(String zhixundongtaiContent) {
        this.zhixundongtaiContent = zhixundongtaiContent;
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
