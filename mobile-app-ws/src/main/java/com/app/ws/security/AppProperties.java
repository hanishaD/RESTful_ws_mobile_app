package com.app.ws.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

//so that this class can autowire some objects that need to be read from the application.properties file.
@Component
public class AppProperties {

	@Autowired
	private Environment env;			//env object can be used to read values from application.properties file
	
	public String getTokenSecret() {
		return env.getProperty("tokenSecret");
	}

}
