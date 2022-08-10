package problems.solutions.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ThirdHighestInArray {

	public static void main(String[] args) {
		// Not possible to sort in reverse order with primitive type with Arrays.sort() method
		int[] arr = {30,45,25,10,100,75,200,50,80};
		
		//Solution with primitive type
		Arrays.sort(arr);
		
		System.out.println("Third Highest Element : " + arr[arr.length -3]);
		
		
		
		// Solution With Integer Object
		
		Integer[] arrInt = {30,45,25,10,100,75,200,50,80};
		
		System.out.println("Before Sorting : " + Arrays.toString(arrInt));
		
		//List arrList = Arrays.asList(arrInt);
		
		Arrays.sort(arrInt, Collections.reverseOrder());
		
		System.out.println("After Sorting : " + Arrays.toString(arrInt));
		
		System.out.println("Third Highest Element : " + arrInt[2]);

	}

}
