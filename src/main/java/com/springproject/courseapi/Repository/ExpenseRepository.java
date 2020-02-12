package com.springproject.courseapi.Repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springproject.courseapi.DTO.ExpenseDetail;

public interface ExpenseRepository extends JpaRepository<ExpenseDetail, Integer> {
	@Query("SELECT DISTINCT a.clientname FROM ExpenseDetail a ")
	public Set<String> findDistinctClientname();
	public List<ExpenseDetail>findByClientname(String clientname);

	
}
