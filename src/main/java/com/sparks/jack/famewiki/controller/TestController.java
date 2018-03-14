package com.sparks.jack.famewiki.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jack
 * Date: 2017/12/7
 * Time: 21:27
 */
@RestController
@RequestMapping("/api")
public class TestController {

	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "/test",produces = "application/json")
	public String test(HttpServletRequest request,HttpServletResponse response){
		return "hello,jack";
	}

}
