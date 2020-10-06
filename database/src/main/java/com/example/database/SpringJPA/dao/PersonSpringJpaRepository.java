package com.example.database.SpringJPA.dao;

import com.example.database.SpringJPA.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringJpaRepository extends JpaRepository<Person,Integer> {
}
