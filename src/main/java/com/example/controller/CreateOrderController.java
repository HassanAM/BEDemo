package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BoData;
import com.example.dto.OrderCreateRequestVo;
import com.example.service.CreateOrderService;


@RestController
@RequestMapping(path = "/bo")
public class CreateOrderController {
	
	private CreateOrderService createOrderService;
	
	@PostMapping(value = "/order", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public BoData createBoUser(@RequestHeader Integer userId, @RequestBody OrderCreateRequestVo request) {
		return createOrderService.createBoUser(userId, request);
	}

}
