package com.lic.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @des 
 * @author lic
 * @data 2020/6/2
 * @param null
 * @return 
 **/
@SpringBootApplication
//
//@EnableDubbo(scanBasePackages="com.lic.gmall")
@EnableDubbo
public class BootSuerServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootSuerServiceProviderApplication.class, args);
	}

}

