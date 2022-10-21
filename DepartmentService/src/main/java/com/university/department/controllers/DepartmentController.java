package com.university.department.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
   public String getHome(){
       return "Home";
   }
}
