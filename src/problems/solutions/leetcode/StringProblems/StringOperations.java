package problems.solutions.leetcode.StringProblems;

public class StringOperations {

	public static void main(String[] args) {
		String str = "abc";
		permutation(str);
	}
	
	public static void permutation(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			String newStr = str.substring(0,i) + str.substring(i+1);
			System.out.println(newStr);
		}
	}
}
