package com.luv2code.springdemomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by personal on 21-04-2017.
 */

@Controller
public class HelloWorldController {
    //need a controller method to show the HTML initial form

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

}
