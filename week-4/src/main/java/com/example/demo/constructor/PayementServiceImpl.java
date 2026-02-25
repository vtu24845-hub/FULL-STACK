package com.example.demo.constructor;

import org.springframework.stereotype.Service;

@Service
public class PayementServiceImpl implements PayementService {
	@Override
	public String pay() {
		return "4.3 : Constructor Injection";
	}
}