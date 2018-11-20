package com.yun.spring.prac.Spring_AOP.Application.business;

import com.yun.spring.prac.Spring_AOP.Application.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yunzhao on 18/11/18.
 */
@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){

        return dao2.getSomething();
    }
}
