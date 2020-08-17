/***********************************************************************************************************
 * Module Name - spring-security-ldap
 * Version Control Block
 * Date			Version	   Author			Reviewer			Change Description
 * -----------  ---------  --------------	----------------	-------------------------------------------
 * Aug 12 2020 1.0	 Kandula, Madhukar        Kumar, Abhaya		Created.
 * -----------  ---------  --------------	----------------	-------------------------------------------
 ***********************************************************************************************************/
package com.madhu.springsecurityldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***********************************************************************************************************
 * Java File: HomeController.java
 * Author: Kandula, Madhukar
 * Description: 
 *
 ***********************************************************************************************************/
@RestController
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "Home Page";
    }
}
