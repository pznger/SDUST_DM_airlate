package com.charles.flight.dao;

import com.charles.flight.domain.FlightInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FlightDao {

    @Insert("INSERT INTO flightplan(no,startAddr,endAddr,planeType,startTime,endTime,arrPercent)" +
            " VALUES(#{no}, #{startAddr}, #{endAddr},#{planeType},#{startTime},#{endTime},#{arrPercent})")
    void insert(FlightInfo flightInfo);

    @Select("SELECT * from flightplan")
    List<FlightInfo> list();

    @Select("SELECT * from flightplan where no = #{no}")
    List<FlightInfo> listByNo(@Param("no") String no);

    @Select("SELECT * from flightplan where startTime like #{date}")
    List<FlightInfo> listByDate(@Param("date") String date);

    @Select("SELECT * from flightplan where no =#{no} and startTime like #{date}")
    List<FlightInfo> listByNoAndDate(@Param("no") String no, @Param("date") String date);
}
