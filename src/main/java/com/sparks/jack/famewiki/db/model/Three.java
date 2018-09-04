// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Three implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long accountid;
	private String threeplat;
	private String threeid;
	private String threenick;
	private Integer gender;
	private String avatar;

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

	public String getThreeplat() {
		return this.threeplat;
	}

	public void setThreeplat(String threeplat) {
		this.threeplat = threeplat;
	}

	public String getThreeid() {
		return this.threeid;
	}

	public void setThreeid(String threeid) {
		this.threeid = threeid;
	}

	public String getThreenick() {
		return this.threenick;
	}

	public void setThreenick(String threenick) {
		this.threenick = threenick;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("three[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("accountid=");
		builder.append(accountid);
		builder.append(", ");
		builder.append("threeplat=");
		builder.append(threeplat);
		builder.append(", ");
		builder.append("threeid=");
		builder.append(threeid);
		builder.append(", ");
		builder.append("threenick=");
		builder.append(threenick);
		builder.append(", ");
		builder.append("gender=");
		builder.append(gender);
		builder.append(", ");
		builder.append("avatar=");
		builder.append(avatar);
		builder.append("]");
		return builder.toString();
	}
}
