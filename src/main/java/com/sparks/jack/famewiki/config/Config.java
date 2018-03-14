package com.sparks.jack.famewiki.config;

import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description: 配置文件类
 * User: jack
 * Date: 2018/3/13
 * Time: 19:55
 */
public class Config {
    private static Logger logger = LoggerFactory.getLogger(Config.class);

    private static String configPath = null;    //配置文件路径
    private static Config instance = new Config();  //config实例
    private static XMLConfiguration config ;
    private final Integer REFRESH_DELAY = 1*1000;
    private static Long conf_last_modify_time = 0L;

    private Config(){
        super();
    }

    public void init(){

    }

    public static Config getInstance(){
        return instance;
    }

    
}
