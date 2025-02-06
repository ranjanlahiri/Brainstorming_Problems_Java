package problems.solutions.leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


 * 
 * 
 * 
 * 
 */



public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] result = twoSum(new int[]{3,2,4},6);
		System.out.println("Result" + Arrays.toString(result));
		
		int [] output = twoSumOptimized(new int[]{3,2,4},6);
		System.out.println("Result" + Arrays.toString(output));
		
	}

// complexity O(n2)	
	public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        int i = 0;
        for(int k = 0; k <= nums.length-1; k++ ){
            for(int j = k+1; j <= nums.length-1; j++){
                //System.out.println(nums[k] + " " + nums[j]);
                if(nums[k] + nums[j] == target){
                    result[i++] = k;
                    result[i] = j;
                    break;
                }
            }    
        }
        return result;        
          
    }
	
// complexity O(n)	
	public static int[] twoSumOptimized(int[] nums, int target) {
        int []arr=new int[2];
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int hai=target-nums[i];
            if(hm.containsKey(hai)){
                arr[0]=hm.get(hai);
                arr[1]=i;
                return arr;
            }else{
                hm.put(nums[i],i);
            }
        }
        return arr;
	}   

}
