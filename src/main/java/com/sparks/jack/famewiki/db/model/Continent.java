// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Continent implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("continent[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
