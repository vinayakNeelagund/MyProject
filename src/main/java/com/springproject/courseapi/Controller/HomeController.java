package com.springproject.courseapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springproject.courseapi.DTO.ExpenseDetail;
import com.springproject.courseapi.serviceInterface.ExpenseServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	private ExpenseServiceInterface expenses;
	
	@GetMapping("/home")
	public String getHomePage() {
		
		return"home";
	}
	@GetMapping("/index")
	public String getIndexPage() {
		
		return"index";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getexpense/{id}")
	public ModelAndView updateTopic(@PathVariable String id) {
		 ModelAndView map = new ModelAndView("home");
		    map.addObject("lists",  expenses.getexpensebyemaillist(id));
		return map;
		
	}
	
}
