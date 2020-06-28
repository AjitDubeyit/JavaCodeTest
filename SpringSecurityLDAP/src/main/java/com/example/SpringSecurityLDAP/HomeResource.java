package com.example.SpringSecurityLDAP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//username : ben
//Password : benspassword
// https://spring.io/guides/gs/authenticating-ldap/   
@RestController
public class HomeResource {

    @GetMapping("/")
    public String index()
    {
        return "home page";
    }

}

