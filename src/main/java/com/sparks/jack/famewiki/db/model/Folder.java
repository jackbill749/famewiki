// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Folder implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long accountid;
	private String name;
	private java.util.Date createtime;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("folder[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("accountid=");
		builder.append(accountid);
		builder.append(", ");
		builder.append("name=");
		builder.append(name);
		builder.append(", ");
		builder.append("createtime=");
		builder.append(createtime);
		builder.append("]");
		return builder.toString();
	}
}
