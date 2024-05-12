package com.dao;

import com.entity.XuexizhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexizhongxinVO;
import com.entity.view.XuexizhongxinView;


/**
 * 学习中心
 * 
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public interface XuexizhongxinDao extends BaseMapper<XuexizhongxinEntity> {
	
	List<XuexizhongxinVO> selectListVO(@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);
	
	XuexizhongxinVO selectVO(@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);
	
	List<XuexizhongxinView> selectListView(@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);

	List<XuexizhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);
	
	XuexizhongxinView selectView(@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);
	

}
