// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Major implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer pid;
	private String name;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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
		builder.append("major[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("pid=");
		builder.append(pid);
		builder.append(", ");
		builder.append("name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
