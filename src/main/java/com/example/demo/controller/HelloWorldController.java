package com.example.demo.controller;


import com.example.demo.component.NeoProperty;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
    public class HelloWorldController {
    @Autowired
    private NeoProperty neoProperty;

        @RequestMapping("/hello")
        public String index() {
            return "Hello World";
        }

        /*
        *  @RequestMapping("/hello")
        *  @ReponseBody
        public String index() {
            return "Hello World";
        }
        * */

        @RequestMapping("/getUser")
        public User getUser(){
            User user = new User();
            user.setPassword(neoProperty.getTitle());
            user.setUserName(neoProperty.getTips());
            System.out.println(user.toString());

            return user;
        }
    }

