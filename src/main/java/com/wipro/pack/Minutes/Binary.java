package com.wipro.pack.Minutes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Binary {
      
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	SortAlgorithm sort;
	
	@PostConstruct
	public void PostConstruct() {
		logger.info("PostLog");
	}
	
	@PreDestroy
	public void PreDestroy() {
		logger.info("PredES");
	}
}
