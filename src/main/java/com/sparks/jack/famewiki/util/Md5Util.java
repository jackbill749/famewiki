package com.sparks.jack.famewiki.util;

import java.security.MessageDigest;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:  md5工具类
 * User: jack
 * Date: 2017/12/13
 * Time: 23:39
 */
public class Md5Util {

    private static char[] alphabet = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();

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

	/**
	 * 返回十位的密码作料
	 * @return eg:VRDqNaHiCe
	 */
    public static String genSalt(){
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 10; i++ ){
            builder.append(alphabet[random.nextInt(58)]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String aa = getMd5("123456");
        String salt = genSalt();
        System.out.println(aa);
        System.out.println(salt);
    }
}
