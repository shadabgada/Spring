package com.example.SpringAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //It is used to operations at various stages(i.e before, after,etc)

    @Around(value="execution(* com.example.SpringAOP.business.*.*(..))")
    public void timeCalculation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;

        logger.info("Time taken by {} is {}",proceedingJoinPoint,timeTaken);
    }
}
