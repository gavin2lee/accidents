package com.gl.roadaccidents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gavin on 16-5-26.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String getHomePage(Model model) {
        return "index";
    }
}
