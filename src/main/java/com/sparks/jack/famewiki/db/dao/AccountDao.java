<<<<<<< HEAD
// auto generated do not edit
package com.sparks.jack.famewiki.db.dao;

public interface AccountDao {
	int insertAndGetAotuIncrementID(com.sparks.jack.famewiki.db.model.Account record);

	int insert(com.sparks.jack.famewiki.db.model.Account record);

}
=======
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
>>>>>>> 9af31cf4fd91bc6dc3298d2e10f79adbe14fa176
