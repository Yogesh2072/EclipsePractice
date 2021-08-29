package com.wipro.pack.ExternalURL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalServiceURL {

	
	@Value("external.service.url")
	private String stringURL;
	
	public String ExternalURL() {
		return stringURL;
	}
}
