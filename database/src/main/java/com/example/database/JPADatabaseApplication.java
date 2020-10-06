package com.example.database;

import com.example.database.SpringJDBC.dao.PersonJdbcDao;
import com.example.database.SpringJDBC.dao.PersonJdbcDaoCustomRowMapper;
import com.example.database.SpringJPA.dao.PersonJpaRepository;
import com.example.database.SpringJPA.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JPADatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository personJpaRepository;
	//we can call this using PersonJpaRepository as well

	public static void main(String[] args) {
		SpringApplication.run(JPADatabaseApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info("get id 1001: {}", personJpaRepository.findById(1001));
		logger.info("insert 1102: {}", personJpaRepository.insert(new Person(1101,"SHAW","MUMBAI",new Date())));
		logger.info("insert 1102: {}", personJpaRepository.insert(new Person("stoinis","banglore",new Date())));
		logger.info("update 1102: {}", personJpaRepository.update(new Person(1101,"SHAW","new delhi",new Date())));
		personJpaRepository.deleteById(2);

		logger.info("All users {}", personJpaRepository.findAll());
	}
}
