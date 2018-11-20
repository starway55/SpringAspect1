package com.yun.spring.prac.Spring_AOP.Application;

import com.yun.spring.prac.Spring_AOP.Application.business.Business1;
import com.yun.spring.prac.Spring_AOP.Application.business.Business2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yunzhao on 20/11/18.
 */
@Component
public class DatabaseManager {

    @Autowired
    private Business1 business1;

    @Autowired
    private Business2 business2;

    public void showAllThings(){

        System.out.println("Dao1 Value: " + business1.calculateSomething());
        System.out.println("Dao2 Value: " + business2.calculateSomething());
    }
}
