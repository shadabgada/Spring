package com.example.SpringAOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.example.SpringAOP.business.*.*(..))")
    public void BusinessLayerExecution(){}

    @Pointcut("execution(* com.example.SpringAOP.data.*.*(..))")
    public void DataLayerExecution(){}

    @Pointcut(" com.example.SpringAOP.aspect.CommonJoinPointConfig.DataLayerExecution() && com.example.SpringAOP.aspect.CommonJoinPointConfig.BusinessLayerExecution()")
    public void AllLayer(){}

    //All beans containing dao
    @Pointcut("bean(*dao*)")
    public void beanContainingDAO(){}

    @Pointcut("bean(dao*)")
    public void beanStartingWithDAO(){}

    //Within Data Layer
    @Pointcut("within(com.example.SpringAOP.data..*)")
    public void withinDataLayer(){}
}
