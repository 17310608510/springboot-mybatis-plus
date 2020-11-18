package com.example.demo.test.dao;

import com.example.demo.test.entity.vo.Myuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 
 * @author zuoruibo
 *
 */
public interface MyuserMapper extends BaseMapper<Myuser> {
	// 方法名自动对应
	public Myuser getUserByName(String name);
}
