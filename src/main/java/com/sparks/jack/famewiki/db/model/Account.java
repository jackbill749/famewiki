// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String username;
	private String nickname;
	private String salt;
	private String password;
	private String avatar;
	private Integer gender;
	private String cellphone;
	private String email;
	private java.util.Date birth;
	private String describe;
	private String region;
	private Integer country;
	private java.util.Date regtime;
	private String registerip;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getBirth() {
		return this.birth;
	}

	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getCountry() {
		return this.country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public java.util.Date getRegtime() {
		return this.regtime;
	}

	public void setRegtime(java.util.Date regtime) {
		this.regtime = regtime;
	}

	public String getRegisterip() {
		return this.registerip;
	}

	public void setRegisterip(String registerip) {
		this.registerip = registerip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("username=");
		builder.append(username);
		builder.append(", ");
		builder.append("nickname=");
		builder.append(nickname);
		builder.append(", ");
		builder.append("salt=");
		builder.append(salt);
		builder.append(", ");
		builder.append("password=");
		builder.append(password);
		builder.append(", ");
		builder.append("avatar=");
		builder.append(avatar);
		builder.append(", ");
		builder.append("gender=");
		builder.append(gender);
		builder.append(", ");
		builder.append("cellphone=");
		builder.append(cellphone);
		builder.append(", ");
		builder.append("email=");
		builder.append(email);
		builder.append(", ");
		builder.append("birth=");
		builder.append(birth);
		builder.append(", ");
		builder.append("describe=");
		builder.append(describe);
		builder.append(", ");
		builder.append("region=");
		builder.append(region);
		builder.append(", ");
		builder.append("country=");
		builder.append(country);
		builder.append(", ");
		builder.append("regtime=");
		builder.append(regtime);
		builder.append(", ");
		builder.append("registerip=");
		builder.append(registerip);
		builder.append("]");
		return builder.toString();
	}
}
