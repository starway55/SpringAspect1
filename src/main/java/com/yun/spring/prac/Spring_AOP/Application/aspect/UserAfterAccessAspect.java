package com.yun.spring.prac.Spring_AOP.Application.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
public class UserAfterAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value="com.yun.spring.prac.Spring_AOP.Application.aspect.CommonJoinPointConfig.businessLayerExecution()",
            returning="result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result){

        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(

            value = "com.yun.spring.prac.Spring_AOP.Application.aspect.CommonJoinPointConfig.businessLayerExecution()",
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Exception exception){


    }

    @After(

            value = "com.yun.spring.prac.Spring_AOP.Application.aspect.CommonJoinPointConfig.businessLayerExecution()"
    )
    public void after(JoinPoint joinPoint){

        logger.info("after execution of {}", joinPoint);
    }
}
