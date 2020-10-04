package com.example.database.SpringJDBC.dao;


import com.example.database.SpringJDBC.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonJdbcDaoCustomRowMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //Implementing Custom Row Mapper
    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {

            Person person = new Person();

            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            person.setBirthDate(resultSet.getTimestamp("birth_date"));

            return person;
        }
    }


    public List<Person> findAll(){
        return jdbcTemplate.query("select *from person",
                new PersonRowMapper());
    }


}
