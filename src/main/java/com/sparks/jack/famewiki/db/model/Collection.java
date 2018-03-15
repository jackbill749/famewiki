// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Collection implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long accountid;
	private Long folderid;
	private Long immortalid;

	public Long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public Long getFolderid() {
		return this.folderid;
	}

	public void setFolderid(Long folderid) {
		this.folderid = folderid;
	}

	public Long getImmortalid() {
		return this.immortalid;
	}

	public void setImmortalid(Long immortalid) {
		this.immortalid = immortalid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("collection[");
		builder.append("accountid=");
		builder.append(accountid);
		builder.append(", ");
		builder.append("folderid=");
		builder.append(folderid);
		builder.append(", ");
		builder.append("immortalid=");
		builder.append(immortalid);
		builder.append("]");
		return builder.toString();
	}
}
