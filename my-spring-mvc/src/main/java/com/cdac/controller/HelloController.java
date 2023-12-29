package com.cdac.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(path = "/hello.cdac", method = RequestMethod.GET )
//	public String sayHello(Map map) {
//		// here map is like model 
//		
//		map.put("message", "Welcome from controller");
//		map.put("name", "Shrikant");
//		map.put("id", 12);
//		map.put("luckynum", (int )Math.ceil(Math.random() * 20 ));
//		return "Hello.jsp" ;
//	}
	
	// using Model from spring
//	public String sayHello(Model map) {
//		// here map is like model 
//		
//		map.addAttribute("message", "Welcome from controller");
//		map.addAttribute("name", "Shrikant");
//		map.addAttribute("id", 12);
//		map.addAttribute("luckynum", (int )Math.ceil(Math.random() * 20 ));
//		return "Hello.jsp" ;
//	}
	
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("message", "Welcome from controller");
		mav.addObject("name", "Shrikant");
		mav.addObject("id", 12);
		mav.addObject("luckynum", (int )Math.ceil(Math.random() * 20 ));
		
		mav.setViewName("Hello.jsp");
		return  mav;
	}
	
	@RequestMapping("/mydemo")
	public String dispaly() {
		return "mydemo.jsp";
	}
	
}
