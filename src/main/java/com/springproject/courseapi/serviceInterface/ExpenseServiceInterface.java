package com.springproject.courseapi.serviceInterface;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.springproject.courseapi.DTO.ExpenseDetail;



@Service
public interface ExpenseServiceInterface {

	public ExpenseDetail addExpense(ExpenseDetail expense);

	public Set<String> getexpenselist();

	public List<ExpenseDetail> getexpensebyemaillist( String id);

}
