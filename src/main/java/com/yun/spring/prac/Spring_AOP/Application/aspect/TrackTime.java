package com.yun.spring.prac.Spring_AOP.Application.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yunzhao on 20/11/18.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//Methods
//Runtime
public @interface TrackTime {


}
