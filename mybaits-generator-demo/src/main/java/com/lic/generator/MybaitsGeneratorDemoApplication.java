package com.lic.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.lic.generator.*"})
@MapperScan("com.lic.generator.dao")
@SpringBootApplication
public class MybaitsGeneratorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybaitsGeneratorDemoApplication.class, args);
	}

}
