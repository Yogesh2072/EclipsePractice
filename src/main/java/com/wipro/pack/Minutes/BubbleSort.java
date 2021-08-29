package com.wipro.pack.Minutes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSort implements SortAlgorithm {
//     If it has also a dependency to be fullfilled, then if we need new instance of that object evrytime 
//     then we need something called"PROXY"
}
