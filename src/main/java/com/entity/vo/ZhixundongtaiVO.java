package com.entity.vo;

import com.entity.ZhixundongtaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 资讯动态
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-19
 */
@TableName("zhixundongtai")
public class ZhixundongtaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 资讯动态名称
     */

    @TableField(value = "zhixundongtai_name")
    private String zhixundongtaiName;


    /**
     * 资讯动态类型
     */

    @TableField(value = "zhixundongtai_types")
    private Integer zhixundongtaiTypes;


    /**
     * 资讯动态图片
     */

    @TableField(value = "zhixundongtai_photo")
    private String zhixundongtaiPhoto;


    /**
     * 资讯动态时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 资讯动态详情
     */

    @TableField(value = "zhixundongtai_content")
    private String zhixundongtaiContent;


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
	 * 设置：资讯动态名称
	 */
    public String getZhixundongtaiName() {
        return zhixundongtaiName;
    }


    /**
	 * 获取：资讯动态名称
	 */

    public void setZhixundongtaiName(String zhixundongtaiName) {
        this.zhixundongtaiName = zhixundongtaiName;
    }
    /**
	 * 设置：资讯动态类型
	 */
    public Integer getZhixundongtaiTypes() {
        return zhixundongtaiTypes;
    }


    /**
	 * 获取：资讯动态类型
	 */

    public void setZhixundongtaiTypes(Integer zhixundongtaiTypes) {
        this.zhixundongtaiTypes = zhixundongtaiTypes;
    }
    /**
	 * 设置：资讯动态图片
	 */
    public String getZhixundongtaiPhoto() {
        return zhixundongtaiPhoto;
    }


    /**
	 * 获取：资讯动态图片
	 */

    public void setZhixundongtaiPhoto(String zhixundongtaiPhoto) {
        this.zhixundongtaiPhoto = zhixundongtaiPhoto;
    }
    /**
	 * 设置：资讯动态时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：资讯动态时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：资讯动态详情
	 */
    public String getZhixundongtaiContent() {
        return zhixundongtaiContent;
    }


    /**
	 * 获取：资讯动态详情
	 */

    public void setZhixundongtaiContent(String zhixundongtaiContent) {
        this.zhixundongtaiContent = zhixundongtaiContent;
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
