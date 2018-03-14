package com.sparks.jack.famewiki.constant;

/**
 * Created with IntelliJ IDEA.
 * Description:  返回码
 * User: jack
 * Date: 2017/12/11
 * Time: 23:25
 */
public enum Retcode {

	SUCCESS(0,"success","成功"),
	LOGIN_FAILED(1001,"login failed","登录失败"),
	PARAM_INVALID_ERROR(1002,"parameter invalid error","参数不合法"),
	TOKEN_INVALID_ERROR(1003,"token invalid error","口令已失效,请重新登陆"),
	AUTH_INVALID_ERROR(1004,"auth invalid error","权限认证失败"),
	INTERNAL_ERROR(1005,"application internal error","程序内部错误"),
	DB_ERROR(1006,"database error","数据库错误"),

	ACCOUNT_NOT_EXIST(1010,"account not exist","用户不存在"),
	USERNAME_OR_PASSWORD_INVALID(1011,"username or password invalid","用户名或密码错误"),
	USERNAME_ALREADY_INUSE(1012,"username already inuse","该用户名已被使用"),



	;
	private Integer retcode;
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

	Retcode(Integer retcode, String message, String describe) {
		this.retcode = retcode;
		this.message = message;
		this.describe = describe;
	}
}
