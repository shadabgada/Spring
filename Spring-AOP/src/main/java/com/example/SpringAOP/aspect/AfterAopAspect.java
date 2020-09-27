package com.example.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value="execution(* com.example.SpringAOP.business.*.*(..))",
    returning="result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        logger.info("{} returned with value {}", joinPoint,result);
    }

    @AfterThrowing(value="execution(* com.example.SpringAOP.business.*.*(..))",
            throwing = "Exception")
    public void afterThrowing(JoinPoint joinPoint, Object Exception){
        logger.info("{} throw exception {}",joinPoint,Exception);
    }

    //This after is Generic. Both above can be handled using after annotation
    @After(value="execution(* com.example.SpringAOP.business.*.*(..))")
    public  void after(JoinPoint joinPoint){
        logger.info("after execution of {}",joinPoint
        );
    }
}
