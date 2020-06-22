package com.example.service;

import com.example.dto.BoData;
import com.example.dto.OrderCreateRequestVo;

public interface CreateOrderService {
	
	public BoData createBoUser(Integer userId, OrderCreateRequestVo request);

}
