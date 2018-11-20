package com.yun.spring.prac.Spring_AOP.Application.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yunzhao on 19/11/18.
 */

//AOP
//Configuration
@Configuration
@Aspect
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..) all package, all class, all method
    @Before("execution(* com.yun.spring.prac.Spring_AOP.Application.business.*.*(..))")
    public void before(JoinPoint joinPoint){

        logger.info(" Check for user access ");
        logger.info("Intercepted Method Calls - {}", joinPoint);
    }
}

// Intercepts all database get calls, does not need to write one for each method.