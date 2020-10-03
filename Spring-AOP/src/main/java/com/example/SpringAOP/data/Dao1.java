package com.example.SpringAOP.data;

import com.example.SpringAOP.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retreiveSomething(){
        return "Dao1";
    }
}
