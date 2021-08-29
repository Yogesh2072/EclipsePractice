package com.wipro.pack.ExternalURL;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.wipro.pack.Components.BUBBLESORTCLASS;

//import com.wipro.pack.Components.*;
//@ComponentScan("com.wipro.pack.Components")
//@ComponentScan("com.wipro.pack.Minutes")
// Why we need component scan because to tell to pick classes from other packages also otherwise it will 
// only instaniate class of the package under it is defined
@Configuration
@ComponentScan("com.wipro.pack.ExternalURL")
@PropertySource("app.properties")
public class Application2 {
	

	private static Logger logger = LoggerFactory.getLogger(ExternalServiceURL.class);
//	This method is used to find or create a logger with the name passed as parameter. 
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, arxgs);
//	    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
		AnnotationConfigApplicationContext applicationcontext = new AnnotationConfigApplicationContext(Application2.class);
		System.out.println("Kuch bhi likh kr dekh lo ...kuch nhi hnoe wala");
		System.out.println( " " + 1);
		ExternalServiceURL bs1 = applicationcontext.getBean(ExternalServiceURL.class);

		logger.info("{}",bs1);
/*		The info() method of a Logger class used to Log an INFO message.
	    This method is used to forward logs to all the registered output Handler objects.
	    INFO message: Info is for the use of administrators or advanced users. 
	    It denotes mostly the actions that have lead to a change in state for the application.
*/	
//		BubbleSort bs2 = applicationcontext.getBean(BubbleSort.class);
//		logger.info("{}",bs2);
		System.out.println("Kuch bhi likh kr dekh lo ...kuch nhi hnoe wala");
	}

}
