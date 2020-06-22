package com.example.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dto.BoData;
import com.example.dto.OrderCreateRequestVo;
import com.example.dto.OrderCreateResponseVo;
import com.example.model.Order;
import com.example.repository.OrderRepository;

public class CreateOrderServiceImpl implements CreateOrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public BoData createBoUser(Integer userId, OrderCreateRequestVo request) {

		Timestamp actionTime = new Timestamp(new Date().getTime());

		Optional<Order> creator = orderRepository.findById(userId);

		if (creator == null) {
			System.out.println("40003 :" + "Creator ID not existed.");
		}

		List<Order> hotelList = orderRepository.findByHotelName(request.getHotelname());
		if (hotelList != null && !hotelList.isEmpty()) {
			System.out.println("40003 : " + "Hotel with same hotel name existed.");
		}

		if (request.getCustomerDetails() == null) {
			System.out.println("40004" + "Customer cannot be null.");
			return null;

		}

			Order insertRecord = new Order();
			insertRecord.setHotelName(request.getHotelname());
			insertRecord.setHotelId(request.getHotelId());
			insertRecord.setCheckInDate(request.getCheckInDate());
			insertRecord.setCheckOutDate(request.getCheckOutDate());
			insertRecord.setCustomerId(request.getCustomerDetails().getCustomerId());
			orderRepository.saveAndFlush(insertRecord);

			OrderCreateResponseVo responseVo = new OrderCreateResponseVo();
			responseVo.setResponseId("");

			return (BoData) responseVo;

	}

}
