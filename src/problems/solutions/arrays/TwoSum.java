package problems.solutions.arrays;

import java.util.Arrays;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        
        for(int i=0; i < nums.length; i++){
            if(nums[i] <= target){                
                for(int j = i+1 ; j< nums.length ; j++ ){
                    if(nums[j] == (target - nums[i])){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }            
        }
        return null;
    }
}

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {-1,-2,-3,-4,-5};
		int target = -8;
		
		TwoSumSolution obj = new TwoSumSolution();
		
		int [] result = obj.twoSum(nums, target);
		
		System.out.println("Result : " + Arrays.toString(result));

	}

}
