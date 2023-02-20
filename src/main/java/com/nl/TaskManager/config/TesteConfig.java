package com.nl.TaskManager.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.nl.TaskManager.services.DBService;

@Configuration
@Profile("teste")
public class TesteConfig {
	@Autowired
	DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	String value;
	
	@Bean 
	public void instanciaTesteDB() {
		if(value.equals("update"))dbService.iniciaDB();
	}
}
