package com.zack6849.website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(ModelMap model){
        model.addAttribute("pageTitle","Index - zack6849");
        model.addAttribute("showFooter", true);
        return "index";
    }
}
