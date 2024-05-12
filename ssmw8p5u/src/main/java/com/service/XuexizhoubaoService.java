package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexizhoubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexizhoubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexizhoubaoView;


/**
 * 学习周报
 *
 * @author 
 * @email 
 * @date 2022-05-05 16:27:46
 */
public interface XuexizhoubaoService extends IService<XuexizhoubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexizhoubaoVO> selectListVO(Wrapper<XuexizhoubaoEntity> wrapper);
   	
   	XuexizhoubaoVO selectVO(@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);
   	
   	List<XuexizhoubaoView> selectListView(Wrapper<XuexizhoubaoEntity> wrapper);
   	
   	XuexizhoubaoView selectView(@Param("ew") Wrapper<XuexizhoubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexizhoubaoEntity> wrapper);
   	

}

