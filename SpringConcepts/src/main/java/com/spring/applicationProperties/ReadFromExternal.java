package com.spring.applicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadFromExternal {

	@Value("${external.service.url}")
	private String url;
	
	public String getUrl()
	{
		return url;
	}
}
