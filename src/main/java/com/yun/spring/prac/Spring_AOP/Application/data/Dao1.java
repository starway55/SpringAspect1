package com.yun.spring.prac.Spring_AOP.Application.data;

import com.yun.spring.prac.Spring_AOP.Application.aspect.TrackTime;
import org.springframework.stereotype.Repository;

/**
 * Created by yunzhao on 18/11/18.
 */
@Repository
public class Dao1 {

    @TrackTime
    public String getSomething(){

        return "Dao1";
    }
}
