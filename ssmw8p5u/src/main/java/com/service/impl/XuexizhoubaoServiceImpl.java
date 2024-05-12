package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexizhoubaoDao;
import com.entity.XuexizhoubaoEntity;
import com.service.XuexizhoubaoService;
import com.entity.vo.XuexizhoubaoVO;
import com.entity.view.XuexizhoubaoView;

@Service("xuexizhoubaoService")
public class XuexizhoubaoServiceImpl extends ServiceImpl<XuexizhoubaoDao, XuexizhoubaoEntity> implements XuexizhoubaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexizhoubaoEntity> page = this.selectPage(
                new Query<XuexizhoubaoEntity>(params).getPage(),
                new EntityWrapper<XuexizhoubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexizhoubaoEntity> wrapper) {
		  Page<XuexizhoubaoView> page =new Query<XuexizhoubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexizhoubaoVO> selectListVO(Wrapper<XuexizhoubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexizhoubaoVO selectVO(Wrapper<XuexizhoubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexizhoubaoView> selectListView(Wrapper<XuexizhoubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexizhoubaoView selectView(Wrapper<XuexizhoubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
