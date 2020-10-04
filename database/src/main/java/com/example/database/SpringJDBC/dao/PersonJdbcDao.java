package com.example.database.SpringJDBC.dao;

import com.example.database.SpringJDBC.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //to get all records =>use query method
    public List<Person> findAll(){
        return jdbcTemplate.query("select *from person",
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    //to get single record => use queryForObject method
    public Person findById(int id){
        return jdbcTemplate.queryForObject
                ("select *from person where id=?",new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }
    //to delete => use Update method
    public int deleteById(int id){
        return jdbcTemplate.update
                ("delete from person where id=?",new Object[]{id});
    }
    //delete by multiple attributes
    public int deleteByIdandLocation(int id, String location){
        return jdbcTemplate.update
                ("delete from person where id=? and location=?",new Object[]{id,location});
    }



    //Insert Person
    public int insert(Person person){
        return jdbcTemplate.update
                ("INSERT INTO PERSON\n" +
                                "(ID,NAME,LOCATION,BIRTH_DATE)\n" +
                                "VALUES(?,?,?,?)",
                        new Object[]{person.getId(),person.getName(),person.getLocation(),
                                new Timestamp(person.getBirthDate().getTime())});
    }

    //Update Person
    public int update(Person person){
        return jdbcTemplate.update
                ("update person\n" +
                                "set name=?,location=?,birth_date=?\n" +
                                "where id=?",
                        new Object[]{person.getName(),person.getLocation(),
                                new Timestamp(person.getBirthDate().getTime()),person.getId()});
    }






}

