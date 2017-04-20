package com.luv2code.springdemomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by personal on 21-04-2017.
 */
@Controller
public class FoodController {
        @RequestMapping("/food/{id}")
        public String showPage() {
            return "food";
        }
    }
