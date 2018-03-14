package com.sparks.jack.famewiki.controller;

import com.sparks.jack.famewiki.constant.Retcode;
import com.sparks.jack.famewiki.result.BaseResult;
import com.sparks.jack.famewiki.result.LoginResult;
import com.sparks.jack.famewiki.service.AccountService;
import com.sparks.jack.famewiki.service.LoginService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created with IntelliJ IDEA.
 * Description: 登录处理器
 * User: jack
 * Date: 2017/12/11
 * Time: 23:16
 */
@RestController
@RequestMapping("wiki")
public class LoginController {

	@Resource
	private LoginService loginService;


	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = "login",produces = "application/json")
	public BaseResult login(HttpServletRequest request,HttpServletResponse response,
	                        @RequestParam(value = "username",required = true)String username,
	                        @RequestParam(value = "password",required = true)String password){
		StringBuilder builder = new StringBuilder();
		BaseResult result = null;
		builder.append("login:").append("username = ").append(username).append(",password = ").append(password);
		if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
			result = new LoginResult(Retcode.PARAM_INVALID_ERROR);
			logger.error(builder.append(result).toString());
			return result;
		}

		result = loginService.login(username,password,request);
		if(result.getRetcode() == Retcode.SUCCESS.getRetcode()){
			logger.info(builder.append(result).toString());
		}else{
			logger.error(builder.append(result).toString());
		}
		return result;
	}


	@RequestMapping(value = "register",produces = "application/json")
	public BaseResult register(HttpServletRequest request,
							   @RequestParam(value = "username",required = true)String username,
							   @RequestParam(value = "password",required = true)String password,
							   @RequestParam()
							   @RequestParam(value = "")){}
}
