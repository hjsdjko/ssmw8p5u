package com.entity.model;

import com.entity.XuexizhoubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学习周报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public class XuexizhoubaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 周报内容
	 */
	
	private String zhoubaoneirong;
		
	/**
	 * 周报日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
