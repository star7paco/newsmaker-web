package com.s7soft.web.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController{

	@RequestMapping(value = "/top", method = RequestMethod.GET)
    public String top() {
		 ModelAndView view = new ModelAndView();
		  view.setViewName("/top");
		  view.addObject("welcomeMessage", "Welcome Message");
        return "top";
    }
}