package com.charles.flight.service;

import com.charles.flight.domain.FlightInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: fan_mei
 * @Date: 2020/5/20 18:07
 **/
@SpringBootTest
class FlightServiceTest {
    @Autowired
    FlightService flightService;


    @Test
    public void t1() {
        List<FlightInfo> flightInfos = flightService.listByDate("2019/6/17");
        flightInfos.forEach(System.out::println);
    }
}