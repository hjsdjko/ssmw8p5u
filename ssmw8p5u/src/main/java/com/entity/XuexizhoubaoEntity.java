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
 * 学习周报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
@TableName("xuexizhoubao")
public class XuexizhoubaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexizhoubaoEntity() {
		
	}
	
	public XuexizhoubaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 周报标题
	 */
					
	private String zhoubaobiaoti;
	
	/**
	 * 周报内容
	 */
					
	private String zhoubaoneirong;
	
	/**
	 * 周报日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhoubaoriqi;
	
	/**
	 * 周报图片
	 */
					
	private String zhoubaotupian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：周报标题
	 */
	public void setZhoubaobiaoti(String zhoubaobiaoti) {
		this.zhoubaobiaoti = zhoubaobiaoti;
	}
	/**
	 * 获取：周报标题
	 */
	public String getZhoubaobiaoti() {
		return zhoubaobiaoti;
	}
	/**
	 * 设置：周报内容
	 */
	public void setZhoubaoneirong(String zhoubaoneirong) {
		this.zhoubaoneirong = zhoubaoneirong;
	}
	/**
	 * 获取：周报内容
	 */
	public String getZhoubaoneirong() {
		return zhoubaoneirong;
	}
	/**
	 * 设置：周报日期
	 */
	public void setZhoubaoriqi(Date zhoubaoriqi) {
		this.zhoubaoriqi = zhoubaoriqi;
	}
	/**
	 * 获取：周报日期
	 */
	public Date getZhoubaoriqi() {
		return zhoubaoriqi;
	}
	/**
	 * 设置：周报图片
	 */
	public void setZhoubaotupian(String zhoubaotupian) {
		this.zhoubaotupian = zhoubaotupian;
	}
	/**
	 * 获取：周报图片
	 */
	public String getZhoubaotupian() {
		return zhoubaotupian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
