package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TBL_ORDER")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order implements Serializable{
	
	public static final String TIMESTAMP_FORMAT  = "yyyy-MM-dd'T'HH:mm:ssXXX";
	public static final String TIMEZONE          = "Asia/Kuala_Lumpur";
	
	private static final long serialVersionUID = 6891908065661402667L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "HOTEL_ID", nullable = false)
    private String hotelId;

    @Column(name = "HOTEL_NAME", nullable = false)
    private String hotelName;

    @Column(name = "CHECK_IN_DATE", nullable = false)
    private String checkInDate;
    
    @Column(name = "CHECK_OUT_DATE", nullable = false)
    private String checkOutDate;

    @Column(name = "CUSTOMER_ID", nullable = false)
	@JsonProperty("customerId")
    private Integer customerId;

    @Column(name = "ROOM_ID", nullable = false)
	@JsonProperty("roomId")
    private Integer roomId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public static String getTimestampFormat() {
		return TIMESTAMP_FORMAT;
	}

	public static String getTimezone() {
		return TIMEZONE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
