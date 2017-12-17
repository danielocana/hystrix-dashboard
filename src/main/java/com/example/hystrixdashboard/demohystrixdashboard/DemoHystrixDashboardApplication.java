package com.example.hystrixdashboard.demohystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class DemoHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHystrixDashboardApplication.class, args);
	}
}
