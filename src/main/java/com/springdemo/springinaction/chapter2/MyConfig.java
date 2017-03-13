package com.springdemo.springinaction.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfig {

	@Bean(name = "classRoomAlias")
	public ClassRoom classRoom(){
		return new ClassRoom();
	}
}
