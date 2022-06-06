package problems.solutions.codility;

import java.util.Arrays;

/*
// Two sum Solution : This programs returns the indexes of elements array which is sums to the target
// For Example :
// If target is 8 and array contains following elements [-1,2,3,-4,5] then 
// Expected result is : Result : [2, 4] as array element 3 ( index 2 ) and 5 ( index 4 ) sums up to target
 * This program will pick up the single occurrence of such combination

*/
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
		
		int[] nums = {1,2,3,4,5};
		int target = 7;
		
		TwoSumSolution obj = new TwoSumSolution();
		
		int [] result = obj.twoSum(nums, target);
		
		System.out.println("Result : " + Arrays.toString(result));

	}

}
