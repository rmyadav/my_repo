package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Profile;

//import com.demo.dto.DBConfig;

@SpringBootApplication
public class MisctopicsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MisctopicsDemoApplication.class, args);
	}/*
	 @Bean
	 @Profile(value="test")
	 public DBConfig getDBConfig() {
		 DBConfig dbConfig = new DBConfig("jdbc:odbc://localhost:3303/testdb", "testuser");
		 return dbConfig;
		 
	 }*/
}
