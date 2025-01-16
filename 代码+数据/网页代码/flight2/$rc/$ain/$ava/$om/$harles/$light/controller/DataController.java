package com.charles.flight.controller;

import com.charles.flight.domain.FlightInfo;
import com.charles.flight.query.FlightQuery;
import com.charles.flight.service.FlightService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    FlightService flightService;

    @RequestMapping("/detail/info")
    public List<FlightInfo> detailInfo(@RequestParam("airNo") String airNo,
                                       @RequestParam("airDate") String airDate) {
        FlightQuery query = new FlightQuery(airNo,airDate);
        List<FlightInfo> res;
        System.out.println(ToStringBuilder.reflectionToString(query));
        if (StringUtils.isEmpty(query.getAirDate()) && StringUtils.isEmpty(query.getAirNo())) {
            System.out.println("No1");
             res = flightService.list();
        }
        else if (StringUtils.isEmpty(query.getAirNo())){
            res = flightService.listByDate(query.getAirDate());
            System.out.println("No2");
        }
        else if (StringUtils.isEmpty(query.getAirDate()))
        {
            System.out.println("No3");
            res =  flightService.listByNo(query.getAirNo());
        }
        else{
            System.out.println("No4");
            res =  flightService.listByNoAndDate(query.getAirNo(), query.getAirDate());
        }
        res.forEach(System.out::println);
        return res;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
