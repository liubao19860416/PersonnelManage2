package com.mwq.hibernate.mapping;

import java.util.HashSet;
import java.util.Set;

public class TbNativePlace implements java.io.Serializable {

	// Fields

	private Integer id;

	private String name;

	// Constructors

	public TbNativePlace() {
	}

	// Property accessors

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

}