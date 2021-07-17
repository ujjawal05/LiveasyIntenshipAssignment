package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Load;
import com.example.demo.service.LoadService;



@RestController
@RequestMapping("/load")
public class ApplicationController {

@Resource 
LoadService loadService;

@GetMapping(value = "/getAllLoad")
public List<Load> getLoads() {
return loadService.findAll();

}

@PostMapping(value = "/createLoad")
public void createLoad(@RequestBody Load load) {
 loadService.insertLoad(load);

}
@PutMapping(value = "/updateLoad")
public void updateLoad(@RequestBody Load load) {
 loadService.updateLoad(load);

}
@PutMapping(value = "/executeUpdateLoad")
public void executeUpdateLoad(@RequestBody Load load) {
 loadService.executeUpdateLoad(load);

}

@DeleteMapping(value = "/deleteLoadById")
public void deleteLoad(@RequestBody Load load) {
 loadService.deleteLoad(load);

}


}