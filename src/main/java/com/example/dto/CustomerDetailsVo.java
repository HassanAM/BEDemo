package com.example.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude
public class CustomerDetailsVo {

	private Integer customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhnNumber;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhnNumber() {
		return customerPhnNumber;
	}
	public void setCustomerPhnNumber(String customerPhnNumber) {
		this.customerPhnNumber = customerPhnNumber;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
	
}
