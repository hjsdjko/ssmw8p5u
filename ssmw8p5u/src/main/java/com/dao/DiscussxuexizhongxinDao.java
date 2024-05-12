package com.dao;

import com.entity.DiscussxuexizhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexizhongxinVO;
import com.entity.view.DiscussxuexizhongxinView;


/**
 * 学习中心评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public interface DiscussxuexizhongxinDao extends BaseMapper<DiscussxuexizhongxinEntity> {
	
	List<DiscussxuexizhongxinVO> selectListVO(@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);
	
	DiscussxuexizhongxinVO selectVO(@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);
	
	List<DiscussxuexizhongxinView> selectListView(@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);

	List<DiscussxuexizhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);
	
	DiscussxuexizhongxinView selectView(@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);
	

}
