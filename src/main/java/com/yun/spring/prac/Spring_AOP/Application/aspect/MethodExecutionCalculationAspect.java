package com.yun.spring.prac.Spring_AOP.Application.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around(value = "execution(* com.yun.spring.prac.Spring_AOP.Application.business.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis(); // Intercepted

        joinPoint.proceed(); // Proceed with method

        long timeTaken = System.currentTimeMillis() - startTime;
        // startTime = x
        // allow execution of method
        // end Time = y

        logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
    }
}
