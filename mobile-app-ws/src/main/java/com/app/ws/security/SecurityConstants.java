package com.app.ws.security;

import com.app.ws.SpringApplicationContext;

public class SecurityConstants {
	public static final long EXPIRATION_TIME = 864000000; 			//Token expiration time in ms, set to 10 days
	public static final String TOKEN_PREFIX = "Bearer";				//will be passed with the Header string in HTTP reqeust
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users";
	
	public static String getTokenSecret() {
		AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("appProperties");
		return appProperties.getTokenSecret();
	}

}
