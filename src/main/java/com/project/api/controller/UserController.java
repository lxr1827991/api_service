package com.project.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lxapp.common.AppInterface;
import com.lxapp.common.JsonResult;
import com.lxapp.spring.BaseController;
import com.lxapp.utils.AppUtils;
import com.project.api.entity.User;
import com.project.api.service.UserService;



/**
 * 用户服务
 * @author Administrator
 *
 */
@RequestMapping
@Controller
public class UserController extends BaseController{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	UserService userService;
	
	@RequestMapping("getUser")
	@ResponseBody
	public Object getUser() {
		AppInterface appInterface = AppUtils.getAppInterface();
		//对应需要登录的接口需返回错误
		if(!AppUtils.isLogin())return JsonResult.getFailResult(JsonResult.UN_LOGIN);
		
		User user = userService.getUser(AppUtils.getUid());
		
		return JsonResult.getSuccessResult(user);

	}
	
	
	@RequestMapping("file")
	@ResponseBody
	public Object test(MultipartFile img,HttpServletRequest request) {
		
		System.out.println(request.getQueryString());
		return JsonResult.getSuccessResult("");

	}
	
}
