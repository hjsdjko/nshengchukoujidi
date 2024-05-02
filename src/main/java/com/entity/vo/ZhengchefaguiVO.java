package com.entity.vo;

import com.entity.ZhengchefaguiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 政策法规
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("zhengchefagui")
public class ZhengchefaguiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 政策法规详情
     */

    @TableField(value = "zhengchefagui_content")
    private String zhengchefaguiContent;


    /**
     * 创建时间 show2 show1 nameShow
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
	 * 设置：创建时间 show2 show1 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 show1 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
