package com.springdemo.springinaction.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ClassRoom {
	
	@Autowired
	private Teacher teacher;
	
	public ClassRoom() {
		super();
	}
	
	public ClassRoom(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClassRoom [teacher=" + teacher + "]";
	}	
	
	
}
