// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Immortal implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String cname;
	private String fname;
	private Integer gender;
	private String field;
	private String avatar;
	private Integer nationality;
	private String born;
	private java.util.Date birth;
	private java.util.Date death;
	private String constellation;
	private String college;
	private String contribution;
	private String honor;
	private String description;
	private Integer view;
	private Integer favor;
	private Long create_account;
	private java.util.Date create_time;
	private Long modify_account;
	private java.util.Date modify_time;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getNationality() {
		return this.nationality;
	}

	public void setNationality(Integer nationality) {
		this.nationality = nationality;
	}

	public String getBorn() {
		return this.born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	public java.util.Date getBirth() {
		return this.birth;
	}

	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}

	public java.util.Date getDeath() {
		return this.death;
	}

	public void setDeath(java.util.Date death) {
		this.death = death;
	}

	public String getConstellation() {
		return this.constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getContribution() {
		return this.contribution;
	}

	public void setContribution(String contribution) {
		this.contribution = contribution;
	}

	public String getHonor() {
		return this.honor;
	}

	public void setHonor(String honor) {
		this.honor = honor;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getView() {
		return this.view;
	}

	public void setView(Integer view) {
		this.view = view;
	}

	public Integer getFavor() {
		return this.favor;
	}

	public void setFavor(Integer favor) {
		this.favor = favor;
	}

	public Long getCreate_account() {
		return this.create_account;
	}

	public void setCreate_account(Long create_account) {
		this.create_account = create_account;
	}

	public java.util.Date getCreate_time() {
		return this.create_time;
	}

	public void setCreate_time(java.util.Date create_time) {
		this.create_time = create_time;
	}

	public Long getModify_account() {
		return this.modify_account;
	}

	public void setModify_account(Long modify_account) {
		this.modify_account = modify_account;
	}

	public java.util.Date getModify_time() {
		return this.modify_time;
	}

	public void setModify_time(java.util.Date modify_time) {
		this.modify_time = modify_time;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Immortal[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("cname=");
		builder.append(cname);
		builder.append(", ");
		builder.append("fname=");
		builder.append(fname);
		builder.append(", ");
		builder.append("gender=");
		builder.append(gender);
		builder.append(", ");
		builder.append("field=");
		builder.append(field);
		builder.append(", ");
		builder.append("avatar=");
		builder.append(avatar);
		builder.append(", ");
		builder.append("nationality=");
		builder.append(nationality);
		builder.append(", ");
		builder.append("born=");
		builder.append(born);
		builder.append(", ");
		builder.append("birth=");
		builder.append(birth);
		builder.append(", ");
		builder.append("death=");
		builder.append(death);
		builder.append(", ");
		builder.append("constellation=");
		builder.append(constellation);
		builder.append(", ");
		builder.append("college=");
		builder.append(college);
		builder.append(", ");
		builder.append("contribution=");
		builder.append(contribution);
		builder.append(", ");
		builder.append("honor=");
		builder.append(honor);
		builder.append(", ");
		builder.append("description=");
		builder.append(description);
		builder.append(", ");
		builder.append("view=");
		builder.append(view);
		builder.append(", ");
		builder.append("favor=");
		builder.append(favor);
		builder.append(", ");
		builder.append("create_account=");
		builder.append(create_account);
		builder.append(", ");
		builder.append("create_time=");
		builder.append(create_time);
		builder.append(", ");
		builder.append("modify_account=");
		builder.append(modify_account);
		builder.append(", ");
		builder.append("modify_time=");
		builder.append(modify_time);
		builder.append("]");
		return builder.toString();
	}
}
