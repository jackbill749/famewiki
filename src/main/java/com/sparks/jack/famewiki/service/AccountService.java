package com.sparks.jack.famewiki.service;

import com.sparks.jack.famewiki.db.model.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jack
 * Date: 2017/12/12
 * Time: 0:03
 */
@Service
public class AccountService {

	private static Logger logger = LoggerFactory.getLogger(AccountService.class);

	@Resource
	private AccountDao accountDao;

	public Account selectByName(String name){
		StringBuilder builder = new StringBuilder();
		builder.append("selectByName:").append("name=").append(name);
		Account account = null;
		try{
			account = accountDao.selectByName(name);
			logger.info(builder.append(account).toString());
			return account;
		}catch(Exception e){
			logger.error(builder.append(",exception"+e).toString());
			return null;
		}
	}

	public Account selectById(Long id){
		StringBuilder builder = new StringBuilder();
		builder.append("selectById:").append("id = ").append(id);
		Account account = null;
		try{
			account = accountDao.selectById(id);
			logger.info(builder.append(account).toString());
			return account;
		}catch(Exception e){
			logger.error(builder.append(",exception = "+e).toString());
			return null;
		}
	}

	public Account selectByPhone(String cellphone){
		StringBuilder builder = new StringBuilder();
		builder.append("selectByPhone:").append("cellphone = ").append(cellphone);
		Account account = null;
		try{
			account = accountDao.selectByPhone(cellphone);
			logger.info(builder.append(account).toString());
			return account;
		}catch(Exception e){
			logger.error(builder.append(",exception = "+e).toString());
			return null;
		}
	}

	public Account selectByEmail(String email){
		StringBuilder builder = new StringBuilder();
		builder.append("selectByEmail:").append("email = ").append(email);
		Account account = null;
		try{
			account = accountDao.selectByEmail(email);
			logger.info(builder.append(account).toString());
			return account;
		}catch(Exception e){
			logger.error(builder.append(",exception = "+e).toString());
			return null;
		}
	}

	public int updateAvatar(Long id,String avatar){
		StringBuilder builder = new StringBuilder();
		builder.append("updateAvatar:").append("id =").append(id).append(",avatar=").append(avatar);
		int result = -1;
		try{
			result = accountDao.updateAvatar(id,avatar);
			if(result > 0){
				logger.info(builder.append("update is success").toString());
			}else{
				logger.error(builder.append("update is failed").toString());
			}
			return result;
		}catch(Exception e){
			logger.error(builder.append("update has exception"+e).toString());
			return -1;
		}
	}

	public int deleteAccount(Long id){
		StringBuilder builder = new StringBuilder();
		builder.append("deleteAccount:").append("id = ").append(id);
		int result = -1;
		try{
			result = accountDao.deleteAccount(id);
			if(result > 0){
				logger.info(builder.append("delete account success").toString());
			}else{
				logger.error(builder.append("delete account failed").toString());
			}
			return result;
		}catch(Exception e){
			logger.error(builder.append("delete Account exception"+e).toString());
			return -1;
		}
	}

}
