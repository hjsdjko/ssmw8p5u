package com.entity.view;

import com.entity.XuexizhoubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习周报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
@TableName("xuexizhoubao")
public class XuexizhoubaoView  extends XuexizhoubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexizhoubaoView(){
	}
 
 	public XuexizhoubaoView(XuexizhoubaoEntity xuexizhoubaoEntity){
 	try {
			BeanUtils.copyProperties(this, xuexizhoubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
