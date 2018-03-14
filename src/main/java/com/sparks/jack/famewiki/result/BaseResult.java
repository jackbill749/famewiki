package com.sparks.jack.famewiki.result;

import com.sparks.jack.famewiki.constant.Retcode;

/**
 * Created with IntelliJ IDEA.
 * Description: 通用返回结果类
 * User: jack
 * Date: 2017/12/11
 * Time: 23:41
 */
public abstract class BaseResult {
	private Integer retcode = 0;
	private String  message;
	private String  describe;

	public Integer getRetcode() {
		return retcode;
	}

	public void setRetcode(Integer retcode) {
		this.retcode = retcode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public BaseResult() {
	}

	public BaseResult(Integer retcode, String message, String describe) {
		this.retcode = retcode;
		this.message = message;
		this.describe = describe;
	}

	public BaseResult(Retcode retcode) {
		this.retcode = retcode.getRetcode();
		this.message = retcode.getMessage();
		this.describe = retcode.getDescribe();
	}

	public void setError(Retcode retcode){
		this.retcode = retcode.getRetcode();
		this.message = retcode.getMessage();
		this.describe = retcode.getDescribe();
	}
}
