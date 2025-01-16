package com.charles.flight.domain;

import java.util.Date;

//航班号,出发地,到达地,机型,计划起飞时间,计划到达时间,实际起飞时间,实际到达时间,进出港类型
public class FlightInfo {
    private String no;
    private String startAddr;
    private String endAddr;
    private String planeType;
    private String startTime;
    private String endTime;
    private String arrPercent;


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStartAddr() {
        return startAddr;
    }

    public void setStartAddr(String startAddr) {
        this.startAddr = startAddr;
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getArrPercent() {
        return arrPercent;
    }

    public void setArrPercent(String arrPercent) {
        this.arrPercent = arrPercent;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "no='" + no + '\'' +
                ", startAddr='" + startAddr + '\'' +
                ", endAddr='" + endAddr + '\'' +
                ", planeType='" + planeType + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", arrPercent='" + arrPercent + '\'' +
                '}';
    }
}
