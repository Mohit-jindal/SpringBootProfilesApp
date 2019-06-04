package com.infotech.app;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.app.config.EnvBasedConfig;

@SpringBootApplication
public class SpringBootProfilesAppApplication implements CommandLineRunner 
{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private EnvBasedConfig envBasedConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("DataSource: " + dataSource);
		envBasedConfig.setup();
	}

}
