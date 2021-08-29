package com.wipro.pack.Minutes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
   
	public int message() {
		return 9;
	}
}
