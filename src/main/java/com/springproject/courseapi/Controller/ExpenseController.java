package com.springproject.courseapi.Controller;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.courseapi.DTO.ExpenseDetail;

import com.springproject.courseapi.serviceInterface.ExpenseServiceInterface;

import ch.qos.logback.classic.AsyncAppender;

@RestController
public class ExpenseController {
	@Autowired
	private ExpenseServiceInterface expenses;
	
	AsyncAppender a = new AsyncAppender();
	
	@RequestMapping(method=RequestMethod.POST,value="/expenses")
	public ExpenseDetail  addExpensedetails(@RequestBody ExpenseDetail expense) {
		return expenses.addExpense(expense);
	}
	
	@RequestMapping("/allexpenses")
	public Set<String> getAllExpense() {
		
		return expenses.getexpenselist();
	}
	
	
	

}
