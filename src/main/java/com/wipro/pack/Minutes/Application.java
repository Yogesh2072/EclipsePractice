package com.wipro.pack.Minutes;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.wipro.pack.Components.BUBBLESORTCLASS;

//import com.wipro.pack.Components.*;
@SpringBootApplication
@ComponentScan("com.wipro.pack.Components")
@ComponentScan("com.wipro.pack.Minutes")
// Why we need component scan because to tell to pick classes from other packages also otherwise it will 
// only instaniate class of the package under it is defined
public class Application {
	
	  @Inject
	  SortAlgorithm sort; 
//	private static Logger logger = org.slf4j.LoggerFactory.getLogger(BUBBLESORTCLASS.class);
//	This method is used to find or create a logger with the name passed as parameter. 
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
		ApplicationContext applicationcontext = SpringApplication.run(Application.class, args);
		System.out.println("Kuch bhi likh kr dekh lo ...kuch nhi hnoe wala");
		System.out.println( " " + 1);
		BUBBLESORTCLASS bs1 = applicationcontext.getBean(BUBBLESORTCLASS.class);
//		logger.info("{}",bs1);
/*		The info() method of a Logger class used to Log an INFO message.
	    This method is used to forward logs to all the registered output Handler objects.
	    INFO message: Info is for the use of administrators or advanced users. 
	    It denotes mostly the actions that have lead to a change in state for the application.
*/	
//		BUBBLESORTCLASS bs2 = applicationcontext.getBean(BUBBLESORTCLASS.class);
//		logger.info("{}",bs2);
	}

}
