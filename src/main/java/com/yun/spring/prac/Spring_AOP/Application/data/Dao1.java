package com.yun.spring.prac.Spring_AOP.Application.data;

import org.springframework.stereotype.Repository;

/**
 * Created by yunzhao on 18/11/18.
 */
@Repository
public class Dao1 {

    public String getSomething(){

        return "Dao1";
    }
}
