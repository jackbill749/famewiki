package com.sparks.jack.famewiki.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: redis工具类
 * User: jack
 * Date: 2017/12/21
 * Time: 21:30
 */
public class RedisUtil {
    private static String host = "127.0.0.1";
    private static int    port = 6379;
    private static Jedis jedis = null;
    private static JedisPool jedisPool;


    public static void main(String[] args){
        jedis = new Jedis(host,port);
        jedis.set("name","jackbill749");

        System.out.println(jedis.get("name"));
    }


    public static boolean setString(String key,String value){
        if(key == null){
            return false;
        }
        try{
            jedis.set(key,value);
            return true;
        }catch(Exception e ){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean setString(String key,String value,Long expire){
        if(key == null){
            return false;
        }
        try{
            jedis.set(key,value,null,null,expire);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static String getString(String key){
        return jedis.get(key);
    }

    public static Long delKey(String key){
        return jedis.del(key);
    }

    public static long increase(String key,long num){
        if(num == 1){
           return jedis.incr(key);
        }else{
           return jedis.incrBy(key,num);
        }
    }

    public static long decrease(String key,long num){
        if(num == 1){
            return jedis.decr(key);
        }else{
            return jedis.decrBy(key,num);
        }
    }


    public static boolean isExists(String key){
        return jedis.exists(key);
    }

    public static boolean isConnect(){
        return jedis.isConnected();
    }


    public static long lpush(String key,String value){
        return jedis.lpush(key,value);
    }

    public static String lpop(String key){
        return jedis.lpop(key);
    }

    public static long lpush(String key,String... values){
        return jedis.lpush(key,values);
    }

    public static long sadd(String key,String value){
        return jedis.sadd(key,value);
    }

    public static long sadd(String key,String... values){
        return jedis.sadd(key,values);
    }

    public static Set<String> smembers(String key){
        return jedis.smembers(key);
    }

    public static String spop(String key){
        return jedis.spop(key);
    }



}
