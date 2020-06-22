package com.example.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude
public class OrderCreateRequestVo {
	
	private String hotelId;
	private String hotelname;
	private String checkInDate;
	private String checkOutDate;
	private CustomerDetailsVo customerDetails;
	private List<RoomDetailsVo> roomDetails;
	
	
	
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public CustomerDetailsVo getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(CustomerDetailsVo customerDetails) {
		this.customerDetails = customerDetails;
	}
	public List<RoomDetailsVo> getRoomDetails() {
		return roomDetails;
	}
	public void setRoomDetails(List<RoomDetailsVo> roomDetails) {
		this.roomDetails = roomDetails;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	

}
