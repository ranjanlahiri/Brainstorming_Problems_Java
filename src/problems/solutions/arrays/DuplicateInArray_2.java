package problems.solutions.arrays;

import java.util.Set;
import java.util.HashSet;

public class DuplicateInArray_2 {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,1};
		
		System.out.println("Is Duplicate Present : " + isDuplicate(nums));

	}
	
	public static boolean isDuplicate(int[] nums) {
		
		Set<Integer> arrSet = new HashSet<>();
		
		for(int i : nums) {
			if(arrSet.contains(i)) {
				return true;
			}
			arrSet.add(i);
		}
		return false;
	}

}
