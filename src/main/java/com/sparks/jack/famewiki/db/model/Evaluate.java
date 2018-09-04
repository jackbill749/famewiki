// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Evaluate implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long immortalid;
	private Long accountid;
	private java.util.Date create_time;
	private String content;
	private String ip;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getImmortalid() {
		return this.immortalid;
	}

	public void setImmortalid(Long immortalid) {
		this.immortalid = immortalid;
	}

	public Long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public java.util.Date getCreate_time() {
		return this.create_time;
	}

	public void setCreate_time(java.util.Date create_time) {
		this.create_time = create_time;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("evaluate[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("immortalid=");
		builder.append(immortalid);
		builder.append(", ");
		builder.append("accountid=");
		builder.append(accountid);
		builder.append(", ");
		builder.append("create_time=");
		builder.append(create_time);
		builder.append(", ");
		builder.append("content=");
		builder.append(content);
		builder.append(", ");
		builder.append("ip=");
		builder.append(ip);
		builder.append("]");
		return builder.toString();
	}
}
