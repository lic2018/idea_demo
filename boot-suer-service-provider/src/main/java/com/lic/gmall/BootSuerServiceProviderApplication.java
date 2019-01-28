package com.lic.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//
//@EnableDubbo(scanBasePackages="com.lic.gmall")
@EnableDubbo
public class BootSuerServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSuerServiceProviderApplication.class, args);
	}

}

