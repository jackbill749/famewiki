package com.sparks.jack.famewiki.service;

import com.sparks.jack.famewiki.constant.Retcode;
import com.sparks.jack.famewiki.db.dao.AccountDao;
import com.sparks.jack.famewiki.db.model.Account;
import com.sparks.jack.famewiki.result.BaseResult;
import com.sparks.jack.famewiki.result.LoginResult;
import com.sparks.jack.famewiki.util.Md5Util;
import com.sparks.jack.famewiki.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jack
 * Date: 2017/12/12
 * Time: 22:14
 */
@Service
public class LoginService {
	private static Logger logger = LoggerFactory.getLogger(LoginService.class);

	@Resource
	private AccountDao accountDao;

	public BaseResult login(String username, String password, HttpServletRequest request){
        LoginResult result = new LoginResult(Retcode.SUCCESS);

        //根据用户名查询是否有此用户
        Account account = accountDao.selectByName(username);
        if(account == null){
            logger.error("login failed: user is not exist");
            result.setError(Retcode.ACCOUNT_NOT_EXIST);
            return result;
        }
        if(!account.getPassword().equalsIgnoreCase(Md5Util.getMd5(account.getSalt()+password))){
            logger.error("login failed: password is incorrect");
            result.setError(Retcode.USERNAME_OR_PASSWORD_INVALID);
            return result;
        }

        String expiretime = TokenUtil.genExpiretime();
        String token = TokenUtil.genToken(account.getId()+expiretime);
        result.setExpiretime(expiretime);
        result.setToken(token);
        result.setAvatar(account.getAvatar());
        result.setNickname(account.getNickname());
        result.setUserid(account.getId());
        result.setGender(account.getGender());
        return result;
	}
}
