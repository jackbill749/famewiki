package com.sparks.jack.famewiki.util;

/**
 * Created with IntelliJ IDEA.
 * Description:   口令生成器
 * User: jack
 * Date: 2017/12/7
 * Time: 21:56
 */
public class TokenUtil {

	public static String genToken(String token) {
		return Md5Util.getMd5(token);
	}

	public static String genExpiretime(){
		return Long.toString(DateUtil.getSeconds() + 43200L);
	}
}
