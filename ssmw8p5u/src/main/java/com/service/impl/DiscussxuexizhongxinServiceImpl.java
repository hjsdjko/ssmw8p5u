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


import com.dao.DiscussxuexizhongxinDao;
import com.entity.DiscussxuexizhongxinEntity;
import com.service.DiscussxuexizhongxinService;
import com.entity.vo.DiscussxuexizhongxinVO;
import com.entity.view.DiscussxuexizhongxinView;

@Service("discussxuexizhongxinService")
public class DiscussxuexizhongxinServiceImpl extends ServiceImpl<DiscussxuexizhongxinDao, DiscussxuexizhongxinEntity> implements DiscussxuexizhongxinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexizhongxinEntity> page = this.selectPage(
                new Query<DiscussxuexizhongxinEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexizhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexizhongxinEntity> wrapper) {
		  Page<DiscussxuexizhongxinView> page =new Query<DiscussxuexizhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuexizhongxinVO> selectListVO(Wrapper<DiscussxuexizhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexizhongxinVO selectVO(Wrapper<DiscussxuexizhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexizhongxinView> selectListView(Wrapper<DiscussxuexizhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexizhongxinView selectView(Wrapper<DiscussxuexizhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
