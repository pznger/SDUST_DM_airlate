package com.charles.flight.query;

public class FlightQuery {
    private String airNo;
    private String airDate;

    public FlightQuery(String airNo, String airDate) {
        this.airDate = airDate;
        this.airNo = airNo;
    }

    public String getAirNo() {
        return airNo;
    }

    public void setAirNo(String airNo) {
        this.airNo = airNo;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }
}
