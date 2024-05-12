package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexizhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexizhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexizhongxinView;


/**
 * 学习中心
 *
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public interface XuexizhongxinService extends IService<XuexizhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexizhongxinVO> selectListVO(Wrapper<XuexizhongxinEntity> wrapper);
   	
   	XuexizhongxinVO selectVO(@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);
   	
   	List<XuexizhongxinView> selectListView(Wrapper<XuexizhongxinEntity> wrapper);
   	
   	XuexizhongxinView selectView(@Param("ew") Wrapper<XuexizhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexizhongxinEntity> wrapper);
   	

}

