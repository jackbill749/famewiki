// auto generated do not edit
package com.sparks.jack.famewiki.db.model;

import java.io.Serializable;

public class Introduce implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long immortalid;
	private String content;

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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("introduce[");
		builder.append("id=");
		builder.append(id);
		builder.append(", ");
		builder.append("immortalid=");
		builder.append(immortalid);
		builder.append(", ");
		builder.append("content=");
		builder.append(content);
		builder.append("]");
		return builder.toString();
	}
}
