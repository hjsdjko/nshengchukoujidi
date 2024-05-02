package com.entity.vo;

import com.entity.JidichanpinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 基地产品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("jidichanpin")
public class JidichanpinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
