package com.example.demo.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.entity.vo.Myuser;
import com.example.demo.test.service.IMyuserService;
import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月18日 下午2:22:45 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@RestController
@RequestMapping("/test/myuser")
public class MyuserController {
	@Autowired
	private IMyuserService myuserService;

	@ApiOperation(value = "获得用户列表", notes = "", httpMethod = "GET")
	@RequestMapping(value = "/listUser")
	public JsonResult listUser() {
		// 框架自带的方法
		List<Myuser> list = this.myuserService.list(null);
		return new JsonResult(ResultCode.SUCCESS, list);
	}

	@ApiOperation(value = "根据用户名获得用户记录", notes = "名称不能为空", httpMethod = "GET")
	@ApiImplicitParam(dataType = "string", name = "name", value = "用户名", required = true)
	@RequestMapping(value = "/getUserByName")
	public JsonResult getUserByName(String name) {
		// 自定义的方法
		Myuser myuser = this.myuserService.getUserByName(name);
		return new JsonResult(ResultCode.SUCCESS, myuser);
	}
}
