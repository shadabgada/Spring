package com.learning.basics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

	@Autowired
	private JdbcConnection JdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return JdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		JdbcConnection = jdbcConnection;
	}
	
	@javax.annotation.PostConstruct
	public void PostConstruct()
	{
		System.out.println("PostConstruct");
	}
	
	@javax.annotation.PreDestroy
	public void PreDestroy()
	{
		System.out.println("PreDestroy");		
	}
}
