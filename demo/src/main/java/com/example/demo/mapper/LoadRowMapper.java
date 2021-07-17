package com.example.demo.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entity.Load;



public class LoadRowMapper implements RowMapper<Load> {

@Override
public Load mapRow(ResultSet rs, int arg1) throws SQLException {
Load load = new Load();
//load.setLoadId(rs.getInt("loadId"));
load.setLoadingPoint(rs.getString("loadingPoint"));
load.setUnloadingPoint(rs.getString("unloadingPoint"));
load.setProductType(rs.getString("productType"));
load.setTruckType(rs.getString("truckType"));
load.setNoOfTrucks(rs.getString("noOfTrucks"));
load.setWeight(rs.getString("weight"));
load.setComment(rs.getString("comment"));
load.setShipperId(rs.getString("shipperId"));
load.setDate(rs.getString("Date"));


        return load;
}


}