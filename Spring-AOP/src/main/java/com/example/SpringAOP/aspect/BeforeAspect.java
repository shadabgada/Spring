package com.example.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //execution(* package.*.*(..))
    // execution(any_return_type packege.any_class.any_return_type and any no of parameters)
    @Before("execution(* com.example.SpringAOP.business.*.*(..))")
    public void before(JoinPoint jointPoint){
        //print => check for user access
        //print => allowed access for {}

        logger.info("Intecepted method calls {}",jointPoint);
    }
}
