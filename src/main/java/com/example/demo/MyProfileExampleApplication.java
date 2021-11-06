package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.utility.CustomDataSource;

@SpringBootApplication
@ComponentScan("com.example")
public class MyProfileExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyProfileExampleApplication.class, args);
		CustomDataSource dataSource = (CustomDataSource) context.getBean("CustomDatasource");
		System.out.println(dataSource.toString());
	}

}
