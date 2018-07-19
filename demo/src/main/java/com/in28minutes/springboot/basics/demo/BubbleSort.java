package com.in28minutes.springboot.basics.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {
	
	@Override
	public int[] sortAlgo(int[] nums) {
		//Logic for Bubble Sort
		return nums;
	}
}
