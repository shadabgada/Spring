package com.example.database;

import com.example.database.SpringJDBC.dao.PersonJdbcDao;
import com.example.database.SpringJDBC.dao.PersonJdbcDaoCustomRowMapper;
import com.example.database.SpringJDBC.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Autowired
	PersonJdbcDao personJdbcDao;

	@Autowired
	PersonJdbcDaoCustomRowMapper personJdbcDaoCustomRowMapper;

	@Override
	public void run(String... args) throws Exception {
		logger.info("All the person records: {}", personJdbcDao.findAll());
		logger.info("User id 1003: {}", personJdbcDao.findById(1003));
		logger.info("delete User id 1005:no of rows deleted => {}", personJdbcDao.deleteById(1005));
		logger.info("deletebyIDandLocation:no of rows deleted => {}", personJdbcDao.deleteByIdandLocation(1003,"DELHI"));
		logger.info("Insert Person ", personJdbcDao.insert(new Person(1007,"pant","delhi",new Date())));
		logger.info("Update Person ", personJdbcDao.insert(new Person(1005,"XYZ","MONTREAL",new Date())));

		logger.info("All the person records using custom row mapper: {}", personJdbcDaoCustomRowMapper.findAll());

	}
}
