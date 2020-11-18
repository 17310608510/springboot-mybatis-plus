package com.example.demo.test.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.test.dao.MyuserMapper;
import com.example.demo.test.entity.vo.Myuser;
import com.example.demo.test.service.IMyuserService;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 下午2:15:37 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Service
public class MyuserServiceImpl extends ServiceImpl<MyuserMapper, Myuser> implements IMyuserService{

	@Override
	public Myuser getUserByName(String name) {
		return this.baseMapper.getUserByName(name);
	}


	

}
