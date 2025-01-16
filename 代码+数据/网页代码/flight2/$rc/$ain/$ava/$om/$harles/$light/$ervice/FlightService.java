package com.charles.flight.service;

import com.charles.flight.dao.FlightDao;
import com.charles.flight.domain.FlightInfo;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {
    @Resource
    FlightDao flightDao;

    public void init() {
        File csv = new File("D:\\JetBrains\\IdeaProjects\\flight\\src\\test\\java\\com\\charles\\flight\\data.csv");
        try (CSVReader csvReader = new CSVReaderBuilder(new BufferedReader(new InputStreamReader(new FileInputStream(csv), StandardCharsets.UTF_8))).build()) {
            Iterator<String[]> iterator = csvReader.iterator();
            FlightInfo flightInfo = new FlightInfo();
            while (iterator.hasNext()) {
                String[] next = iterator.next();
                flightInfo.setNo(next[0]);
                flightInfo.setStartAddr(next[1]);
                flightInfo.setEndAddr(next[2]);
                flightInfo.setPlaneType(next[3]);
                flightInfo.setStartTime(next[4]);
                flightInfo.setEndTime(next[5]);
                flightInfo.setArrPercent(getArrPercent());
                flightDao.insert(flightInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<FlightInfo> list() {
        return flightDao.list();
    }

    public List<FlightInfo> listByDate(String date) {
        return flightDao.listByDate("%"+ date + "%");
    }

    public List<FlightInfo> listByNo(String no) {
        return flightDao.listByNo(no);
    }

    public List<FlightInfo> listByNoAndDate(String no, String date) {
        System.out.println("111");
        return flightDao.listByNoAndDate(no, "%"+date + "%");
    }

    public static String getArrPercent() {
        Random random = new Random();
        int i = 40 + random.nextInt(40);
        float res = 0;
        res += i;
        float v = random.nextFloat();
        res += v;
        System.out.println(res + "%");
        return res + "%";
    }
}
