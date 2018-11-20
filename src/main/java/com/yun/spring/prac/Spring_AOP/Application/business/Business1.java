package com.yun.spring.prac.Spring_AOP.Application.business;

import com.yun.spring.prac.Spring_AOP.Application.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yunzhao on 18/11/18.
 */
@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){

        return dao1.getSomething();
    }
}
