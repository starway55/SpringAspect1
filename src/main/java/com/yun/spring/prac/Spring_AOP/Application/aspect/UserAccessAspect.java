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
    //execution(* PACKAGE.*.*(..) all package, all class, all method, any type of arguments



//    @Before("execution(* com.yun.spring.prac.Spring_AOP.Application..*.*(..))") // intercept every call in this package
    @Before("com.yun.spring.prac.Spring_AOP.Application.aspect.CommonJoinPointConfig.dataLayerExecution())") // This is a point cut
    public void before(JoinPoint joinPoint){ // A join point is a specific interception of a method call. An instance of an interception

        logger.info(" Check for user access "); // this is an advice. What do you want to do for a point cut
        logger.info("Intercepted Method Calls - {}", joinPoint);
    }
}

// Aspect is jointpoint + advice
// Intercepts all database get calls, does not need to write one for each method.
// The interception process is called weaving, the framework is called weaver.