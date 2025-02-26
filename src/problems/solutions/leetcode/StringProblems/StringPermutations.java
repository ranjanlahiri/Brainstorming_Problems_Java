package problems.solutions.leetcode.StringProblems;

/*
Print all permutation of a string

*/
public class StringPermutations {

	public static void printPermutation(String str, String permutation) {
		if(str.length() == 0) {
			System.out.println(permutation);
			return;
		}
		for(int i = 0 ; i < str.length() ; i++ ) {
			char currChar = str.charAt(i);
			// Important step to chunk out current character from the String and get combinations of other characters from the string
			String newStr = str.substring(0,i) + str.substring(i + 1);
			printPermutation(newStr, permutation+currChar);
		}
	}
	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str, "");
	}

}
