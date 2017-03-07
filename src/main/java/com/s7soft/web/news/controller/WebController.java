package com.s7soft.web.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.s7soft.web.news.dto.test.TestDto;
import com.s7soft.web.news.service.TestService;

@Controller
public class WebController{

	@Autowired
    private TestService testService;

	@RequestMapping(value = "/showMessage.html", method = RequestMethod.GET)
    public String showMessage(Model model) {
		 model.addAttribute("message", "Welcome Message");
		 System.out.println("call news showMessage.html");

        return "showMessage";
    }

	@RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
	public String test(Model model, @PathVariable int id) {
		TestDto test = testService.getTest(id);
		System.out.println("call MyBatisのサンプルです");
		model.addAttribute("message", "MyBatisのサンプルです");
		model.addAttribute("test", test);
		return "test";
	}
}