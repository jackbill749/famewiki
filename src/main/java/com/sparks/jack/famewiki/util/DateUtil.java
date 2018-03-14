package com.sparks.jack.famewiki.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: 日期工具类
 * User: jack
 * Date: 2017/12/7
 * Time: 21:58
 */
public class DateUtil {
	private static String format = "yyyy-MM-dd hh:mm:ss";
	private static SimpleDateFormat sdf = new SimpleDateFormat(format);

	public static String getDateAsString(Date date){
		return sdf.format(date);
	}

	public static Date getDateFromString(String dateStr){
		Date date = null;
		try{
			date = sdf.parse(dateStr);
		}catch(Exception e){
			return date;
		}
		return date;
	}

	public static Long getSeconds(){
		Date date = new Date();
		return date.getTime()/1000;
	}

	public static void main(String[] args) {
		System.out.println(getSeconds());
	}
}
