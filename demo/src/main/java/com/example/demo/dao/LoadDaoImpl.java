package com.example.demo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Load;
import com.example.demo.mapper.LoadRowMapper;


@Repository
public class LoadDaoImpl implements LoadDao{

public LoadDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
NamedParameterJdbcTemplate template;  

@Override
public List<Load> findAll() {
return template.query("select * from load", new LoadRowMapper());
}
@Override
public void insertLoad(Load load) {
 final String sql = "insert into load(loadingPoint, unloadingPoint , productType,truckType,noOfTrucks,weight,comment,shipperId,Date) values(:loadingPoint,:unloadingPoint,:productType,:truckType,:noOfTrucks,:weight,:comment,:shipperId,:Date)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
.addValue("loadingPoint", load.getLoadingPoint())
.addValue("unloadingPoint", load.getUnloadingPoint())
.addValue("productType", load.getProductType())
.addValue("truckType", load.getTruckType())
.addValue("noOfTrucks", load.getNoOfTrucks())
.addValue("weight", load.getWeight())
.addValue("comment", load.getComment())
.addValue("shipperId", load.getShipperId())
.addValue("Date", load.getDate());
        template.update(sql,param, holder);

}

@Override
public void updateLoad(Load load) {
 final String sql = "update load set loadingPoint=:loadingPoint,unloadingPoint=:unloadingPoint,productType=:productType,truckType=:truckType,noOfTrucks=:noOfTrucks,weight=:weight,comment=:comment,shipperId=:shipperId,Date=:Date where shipperId=:shipperId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
        		.addValue("loadingPoint", load.getLoadingPoint())
        		.addValue("unloadingPoint", load.getUnloadingPoint())
        		.addValue("productType", load.getProductType())
        		.addValue("truckType", load.getTruckType())
        		.addValue("noOfTrucks", load.getNoOfTrucks())
        		.addValue("weight", load.getWeight())
        		.addValue("comment", load.getComment())
        		.addValue("shipperId", load.getShipperId())
        		.addValue("Date", load.getDate());
        template.update(sql,param, holder);

}

@Override
public void executeUpdateLoad(Load load) {
 final String sql = "update load set loadingPoint=:loadingPoint,unloadingPoint=:unloadingPoint,productType=:productType,truckType=:truckType,noOfTrucks=:noOfTrucks,weight=:weight,comment=:comment,shipperId=:shipperId,Date=:Date where loadId=:loadId";


 Map<String,Object> map=new HashMap<String,Object>();  
 map.put("loadingPoint", load.getLoadingPoint());
 map.put("unloadingPoint", load.getUnloadingPoint());
 map.put("productType", load.getProductType());
 map.put("truckType", load.getTruckType());
 map.put("noOfTrucks", load.getNoOfTrucks());
 map.put("weight", load.getWeight());
 map.put("comment", load.getComment());
 map.put("shipperId", load.getShipperId());
 map.put("Date", load.getDate());
 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
    @Override  
    public Object doInPreparedStatement(PreparedStatement ps)  
            throws SQLException, DataAccessException {  
        return ps.executeUpdate();  
    }  
});  


}

@Override
public void deleteLoad(Load load) {
 final String sql = "delete from employee where loadId=:loadId";


 Map<String,Object> map=new HashMap<String,Object>();  
 map.put("loadId", load.getLoadId());

 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
    @Override  
    public Object doInPreparedStatement(PreparedStatement ps)  
            throws SQLException, DataAccessException {  
        return ps.executeUpdate();  
    }  
});  


}

}