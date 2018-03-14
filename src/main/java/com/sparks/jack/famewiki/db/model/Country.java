// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Country implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer locate;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLocate() {
		return this.locate;
	}

	public void setLocate(Integer locate) {
		this.locate = locate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("name=");
		builder.append(name);
		builder.append(", ");
		builder.append("locate=");
		builder.append(locate);
		builder.append("]");
		return builder.toString();
	}
}
