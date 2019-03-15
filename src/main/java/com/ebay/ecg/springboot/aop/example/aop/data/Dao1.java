package com.ebay.ecg.springboot.aop.example.aop.data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String retrieveSomething(){
		logger.info("Dao1 start");
		return "Dao1";
	}

}