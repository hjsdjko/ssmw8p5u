package com.entity.view;

import com.entity.XuexizhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学习中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
@TableName("xuexizhongxin")
public class XuexizhongxinView  extends XuexizhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexizhongxinView(){
	}
 
 	public XuexizhongxinView(XuexizhongxinEntity xuexizhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, xuexizhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
