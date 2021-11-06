package com.example.demo.utility;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("database")
public class CustomDataSource {
	
	private String driver;
	private String username;
	private String password;
	
	public CustomDataSource() {}
	public CustomDataSource(String driver, String username, String password) {
		super();
		this.driver = driver;
		this.username = username;
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
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
	@Override
	public String toString() {
		return "CustomDataSource [driver=" + driver + ", username=" + username + ", password=" + password + "]";
	}
	

}
