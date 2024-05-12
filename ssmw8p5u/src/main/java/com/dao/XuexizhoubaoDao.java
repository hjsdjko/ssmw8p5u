package com.dao;

import com.entity.XuexizhoubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexizhoubaoVO;
import com.entity.view.XuexizhoubaoView;


/**
 * 学习周报
 * 
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public interface XuexizhoubaoDao extends BaseMapper<XuexizhoubaoEntity> {
	
	List<XuexizhoubaoVO> selectListVO(@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);
	
	XuexizhoubaoVO selectVO(@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);
	
	List<XuexizhoubaoView> selectListView(@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);

	List<XuexizhoubaoView> selectListView(Pagination page,@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);
	
	XuexizhoubaoView selectView(@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);
	

}
