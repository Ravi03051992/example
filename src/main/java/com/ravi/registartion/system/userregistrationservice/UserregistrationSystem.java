package com.ravi.registartion.system.userregistrationservice;

import com.ravi.registartion.system.userregistrationservice.dto.EmailKeyDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(EmailKeyDto.class)
public class UserregistrationSystem {
	

	public static void main(String[] args) {
		SpringApplication.run(UserregistrationSystem.class, args);
	}

}
