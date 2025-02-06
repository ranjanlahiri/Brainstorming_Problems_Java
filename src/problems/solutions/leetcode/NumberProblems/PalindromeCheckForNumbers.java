package problems.solutions.leetcode.NumberProblems;

public class PalindromeCheckForNumbers {

	public static void main(String[] args) {

		int x = 121;
		
		System.out.println("Is Palindrome :" + isPalindrome(x));

	}
	
	public static boolean isPalindrome(int x) {
        int rem = 0, param = x;
        boolean flag = false;
        while(x > 0){            
            rem += x % 10;
            rem = rem * 10;
            x = x / 10;            
        }
        if((rem / 10) == param){
            return true;
        }else{
            return false;
        }
    }

}
