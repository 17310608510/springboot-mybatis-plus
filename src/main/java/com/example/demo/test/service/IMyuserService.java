package com.example.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.test.entity.vo.Myuser;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 下午2:12:57 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
public interface IMyuserService extends IService<Myuser>{
	public Myuser getUserByName(String name);
}
