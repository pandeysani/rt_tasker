package com.example.rt_tasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@EnableCaching
@SpringBootApplication(scanBasePackages = "com.example.rt_tasker")
public class RtTaskerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtTaskerApplication.class, args);
	}

}
