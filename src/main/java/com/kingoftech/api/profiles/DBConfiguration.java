package com.kingoftech.api.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
	
	private String url;
	private String username;
	private String password;

	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("DB connection for DEV");
		System.out.println(url);
		return "DB Connection to DEV";
	}

	@Profile("homol")
	@Bean
	public String homolDatabaseConnection() {
		System.out.println("DB Connection to HOMOL ");
		System.out.println(url);
		return "DB Connection to HOMOL";
	}

	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("DB Connection to PROD");
		System.out.println(url);
		return "DB Connection to PROD";
	} 
	
}
