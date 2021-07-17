package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Load;


public interface LoadDao {

List<Load> findAll();

void insertLoad(Load load);

void updateLoad(Load load);
void executeUpdateLoad(Load load);

public void deleteLoad(Load load);
}