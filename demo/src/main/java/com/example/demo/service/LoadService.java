package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Load;



public interface LoadService {
	List<Load> findAll();

	void insertLoad(Load load);

	void updateLoad(Load load);

	void executeUpdateLoad(Load load);

	void deleteLoad(Load load);
	
}