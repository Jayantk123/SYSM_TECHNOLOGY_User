package com.sysm.test.controller;


//import com.sysm.test.dao.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {



    @RequestMapping("/test")
    public String processRequest(){
       return "hello";
    }

    @RequestMapping("/test/{aa}")
    public String processRequestInput(@PathVariable  String aa){
        return "hello--->"+aa;
    }



}
