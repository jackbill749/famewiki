// auto generated do not edit
package com.sparks.jack.famewiki.db.dao;

import org.apache.ibatis.annotations.Param;

public interface AccountDao {
	int insertAndGetAutoIncrementID(com.sparks.jack.famewiki.db.model.Account record);

	int insert(com.sparks.jack.famewiki.db.model.Account record);

	com.sparks.jack.famewiki.db.model.Account selectByName(@Param("username")String username);

	int updateAccountBasicInfo(com.sparks.jack.famewiki.db.model.Account account);

	int deleteById(@Param("id")long id);
}
