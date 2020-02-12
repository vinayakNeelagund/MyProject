package com.springproject.courseapi.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.courseapi.DTO.ExpenseDetail;
import com.springproject.courseapi.DTO.Topic;
import com.springproject.courseapi.Repository.ExpenseRepository;
import com.springproject.courseapi.serviceInterface.ExpenseServiceInterface;

@Service
public class ExpenseServiceImpl implements ExpenseServiceInterface {
	@Autowired
	private ExpenseRepository expenserep;

	@Override
	public ExpenseDetail addExpense(ExpenseDetail expense) {
		return expenserep.save(expense);
	}

	@Override
	public Set<String> getexpenselist() {

		Set<String> exps = new HashSet<>();
		System.out.println(expenserep.findDistinctClientname());
		expenserep.findDistinctClientname().forEach(exps::add);
		// exps.forEach((data)-> {System.out.println(data);});
		return expenserep.findDistinctClientname();
	}

	@Override
	public List<ExpenseDetail> getexpensebyemaillist(String id) {
		List<ExpenseDetail> exps1 = new ArrayList<>();
		expenserep.findByClientname(id).forEach(exps1::add);
		return exps1;
	}

}
