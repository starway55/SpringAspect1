package com.yun.spring.prac.Spring_AOP.Application.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by yunzhao on 20/11/18.
 */
public class CommonJoinPointConfig {

    @Pointcut("execution(* com.yun.spring.prac.Spring_AOP.Application.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.yun.spring.prac.Spring_AOP.Application.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("com.yun.spring.prac.Spring_AOP.Application.aspect.CommonJoinPointConfig.dataLayerExecution() && businessLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    @Pointcut("within(com.yun.spring.prac.Spring_AOP.Application.data..*)")
    public void dataLayerExecutionWithWithin(){}
}
