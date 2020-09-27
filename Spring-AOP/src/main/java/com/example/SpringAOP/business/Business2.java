package com.example.SpringAOP.business;

import com.example.SpringAOP.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calulateSometing(){
        //Business Logic implemented
        return dao2.retreiveSomething();
    }
}
