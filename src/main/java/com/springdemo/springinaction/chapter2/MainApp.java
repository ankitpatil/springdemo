package com.springdemo.springinaction.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@Component
@ContextConfiguration(classes=MyConfig.class)
public class MainApp {

	@Autowired
	private ClassRoom classRoom;
	
	public ClassRoom getClassRoom(){
		return classRoom;
	}
	
	public String toString(){
		return classRoom.toString();
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cntx = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(cntx.getBean("classRoomAlias"));
		System.out.println(cntx.getBean("mainApp"));
	}
}
