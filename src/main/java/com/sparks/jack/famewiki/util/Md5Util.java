package com.sparks.jack.famewiki.util;

import java.security.MessageDigest;

/**
 * Created with IntelliJ IDEA.
 * Description:  md5工具类
 * User: jack
 * Date: 2017/12/13
 * Time: 23:39
 */
public class Md5Util {

    /**
     * 返回任意非空字符串的md5,若参数为空或null,返回null
     * @param data eg."123456"
     * @return     e10adc3949ba59abbe56e057f20f883e
     */
    public static String getMd5(String data){
        if(data == null || data.equals("")){
            return null;
        }
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(data.getBytes("utf-8"));
            return new String(Byte2CharUtil.toHex(md.digest()));
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String aa = getMd5("123456");
        System.out.println(aa);
    }
}
