package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//hello
@SpringBootApplication
@MapperScan("com.accp.dao")
public class Y2abcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Y2abcApplication.class, args);
	}

}
