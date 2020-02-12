package com.springproject.courseapi.DTO;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;



@Entity
public class ExpenseDetail {
	@Id
	@GeneratedValue
	private int expid;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date creatDate;
	@Basic(optional = false)
	@NotNull
	@Column(name = "amount", precision = 19, scale = 4)
	private BigDecimal amount;
	@Column
	private String currency;
	@Column
	private String title;
	@Column
	private String descpp;
	@Column
	private String clientname;
	
	
	public ExpenseDetail() {}


	public int getExpid() {
		return expid;
	}


	public void setExpid(int expid) {
		this.expid = expid;
	}


	public java.util.Date getCreatDate() {
		return creatDate;
	}


	public void setCreatDate(java.util.Date creatDate) {
		this.creatDate = creatDate;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescpp() {
		return descpp;
	}


	public void setDescpp(String descpp) {
		this.descpp = descpp;
	}


	public String getClientname() {
		return clientname;
	}


	public void setClientname(String clientname) {
		this.clientname = clientname;
	}


	@Override
	public String toString() {
		return "ExpenseDetail [expid=" + expid + ", creatDate=" + creatDate + ", amount=" + amount + ", currency="
				+ currency + ", title=" + title + ", descpp=" + descpp + ", clientname=" + clientname + "]";
	}


	
	
}
	