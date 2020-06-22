package com.example.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude
public class RoomDetailsVo {
	
	private Integer roomId;
	private String roomname;
	private String noOfGuest;
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getNoOfGuest() {
		return noOfGuest;
	}
	public void setNoOfGuest(String noOfGuest) {
		this.noOfGuest = noOfGuest;
	}
	
	

}
