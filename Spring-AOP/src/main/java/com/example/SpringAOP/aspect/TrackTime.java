package com.example.SpringAOP.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //APPLIED TO METHODS
@Retention(RetentionPolicy.RUNTIME) //NEED THIS INFO AT RUNTIME
public @interface TrackTime {
}
