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


import com.dao.XuexizhongxinDao;
import com.entity.XuexizhongxinEntity;
import com.service.XuexizhongxinService;
import com.entity.vo.XuexizhongxinVO;
import com.entity.view.XuexizhongxinView;

@Service("xuexizhongxinService")
public class XuexizhongxinServiceImpl extends ServiceImpl<XuexizhongxinDao, XuexizhongxinEntity> implements XuexizhongxinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexizhongxinEntity> page = this.selectPage(
                new Query<XuexizhongxinEntity>(params).getPage(),
                new EntityWrapper<XuexizhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexizhongxinEntity> wrapper) {
		  Page<XuexizhongxinView> page =new Query<XuexizhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexizhongxinVO> selectListVO(Wrapper<XuexizhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexizhongxinVO selectVO(Wrapper<XuexizhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexizhongxinView> selectListView(Wrapper<XuexizhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexizhongxinView selectView(Wrapper<XuexizhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
