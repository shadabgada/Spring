package com.example.SpringAOP.business;

import com.example.SpringAOP.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;
    public String calulateSometing(){
        //Business Logic implemented
        return dao1.retreiveSomething();
    }
}
