package com.s7soft.web.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController{

	@RequestMapping(value = "/showMessage.html", method = RequestMethod.GET)
    public String showMessage(Model model) {
		 model.addAttribute("message", "Welcome Message");
		 System.out.println("call news showMessage.html");

        return "showMessage";
    }
}