package com.sparks.jack.famewiki.controller;

import com.sparks.jack.famewiki.param.RegisterParam;
import com.sparks.jack.famewiki.result.BaseResult;
import com.sparks.jack.famewiki.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class AccountController {
	private Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Resource
	private AccountService accountService;

	@RequestMapping(value = "register",produces = "application/json")
	public BaseResult register(HttpServletRequest request, RegisterParam param){
		return null;
	}
}
