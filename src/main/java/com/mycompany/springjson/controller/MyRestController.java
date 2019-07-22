package com.mycompany.springjson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MyRestController {

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String showJSON(ModelMap model) {

        model.addAttribute("reststring", "JSON STRING");
        return "restview";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String ind(ModelMap model) {

        return "index";
    }
    
    @RequestMapping(value = {"/nonrest"}, method = RequestMethod.GET)
    public String nonRest(ModelMap model) {

        return "Welcome to RestTemplate Example.";
    }

}
