// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Interest implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long accountid;
	private Integer majorid;

	public Long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public Integer getMajorid() {
		return this.majorid;
	}

	public void setMajorid(Integer majorid) {
		this.majorid = majorid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Interest[");
		builder.append("accountid=");
		builder.append(accountid);
		builder.append(", ");
		builder.append("majorid=");
		builder.append(majorid);
		builder.append("]");
		return builder.toString();
	}
}
