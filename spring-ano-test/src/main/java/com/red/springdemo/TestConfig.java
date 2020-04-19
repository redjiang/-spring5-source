package com.red.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author red
 * @date 2020-04-19
 */

@Configuration
public class TestConfig {

	@Bean
	public Person person(){
		return new Person("2","3");
	}
}
