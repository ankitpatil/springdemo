package com.springdemo.springinaction.chapter2;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	String name="teacher name";

	public Teacher() {
		super();
	}
	
	public Teacher(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
	
	
}
