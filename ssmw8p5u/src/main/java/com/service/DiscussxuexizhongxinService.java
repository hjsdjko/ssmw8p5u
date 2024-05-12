package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexizhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexizhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexizhongxinView;


/**
 * 学习中心评论表
 *
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public interface DiscussxuexizhongxinService extends IService<DiscussxuexizhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexizhongxinVO> selectListVO(Wrapper<DiscussxuexizhongxinEntity> wrapper);
   	
   	DiscussxuexizhongxinVO selectVO(@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);
   	
   	List<DiscussxuexizhongxinView> selectListView(Wrapper<DiscussxuexizhongxinEntity> wrapper);
   	
   	DiscussxuexizhongxinView selectView(@Param("ew") Wrapper<DiscussxuexizhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexizhongxinEntity> wrapper);
   	

}

