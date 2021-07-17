package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.example.demo.dao.LoadDao;
import com.example.demo.entity.Load;


@Component
public class LoadServiceImpl implements LoadService{
	@Resource 
	LoadDao loadDao;
	@Override
	public List<Load> findAll() {
		return loadDao.findAll();
	}
	@Override
	public void insertLoad(Load load) {
		loadDao.insertLoad(load);
		
	}
	@Override
	public void updateLoad(Load load) {
		loadDao.updateLoad(load);
		
	}
	@Override
	public void executeUpdateLoad(Load load) {
		loadDao.executeUpdateLoad(load);
		
	}

	@Override
	public void deleteLoad(Load load) {
		loadDao.deleteLoad(load);
		
	}
}