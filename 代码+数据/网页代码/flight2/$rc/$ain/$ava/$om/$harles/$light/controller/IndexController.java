package com.charles.flight.controller;

import com.charles.flight.domain.FlightInfo;
import com.charles.flight.query.FlightQuery;
import com.charles.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    FlightService flightService;

    @RequestMapping("/")
    public String page(){
        return "visual";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/detail")
    public String detail() {
        return "detail";
    }

    @RequestMapping("/refresh")
    @ResponseBody
    public void init() {
        flightService.init();
    }



}
