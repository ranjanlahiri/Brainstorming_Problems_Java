package problems.solutions.arrays;

import java.util.Arrays;
import java.util.List;

public class MaxMinInArray {

	public static void main(String[] args) {
		int[] arrInt = {30,45,25,10,100,75,200,50,80};
		
		// Solution 1 :
		//Arrays.sort(arrInt);
		//System.out.println("Min :" + arrInt[0]);
		//System.out.println("Max :" + arrInt[arrInt.length-1]);		
	
		// Solution 2
		List<Integer> intList = Arrays.asList(30,45,25,10,100,75,200,50,80);
		
		Integer max = intList.stream()
							.mapToInt(i -> i)
							.max()
							.getAsInt();
		
		Integer min = intList.stream()
							.mapToInt(i -> i)
							.min()
							.getAsInt();
		
		System.out.println("Max :" + max);
		System.out.println("Min :" + min);
		
	}

}
