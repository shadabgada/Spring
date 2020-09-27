package com.example.SpringAOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.example.SpringAOP.business.*.*(..))")
    public void BusinessLayerExecution(){}
}
