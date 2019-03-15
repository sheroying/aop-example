package com.ebay.ecg.springboot.aop.example.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebay.ecg.springboot.aop.example.aop.data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething(){
		//Business Logic
		int i = 5/0;
		return dao2.retrieveSomething();
	}
}