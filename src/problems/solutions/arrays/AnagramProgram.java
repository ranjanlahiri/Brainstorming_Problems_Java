package problems.solutions.arrays;

import java.util.Arrays;

class Anagram {
	
	public boolean VerifyAnagram(char[] s1, char[] s2) {
		if(s1.length != s2.length)
			return false;
		
		// sort the letters of the string
		// O(Nlog(N)). This is the bottleneck of the algorithm
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		// consider all the letters one by one and compare it
		// O(N). But the overall running time is O(Nlog(N)) + O(N) = O(Nlog(N))
		
		for(int i=0; i<s1.length; i++) {
			if(s1[i] != s2[i])
				return false;
		}
		
		return true;
	}
}

public class AnagramProgram {

	public static void main(String[] args) {
		
		String subject = "restful";
		
		String anagram = "fluster";
		
		Anagram anagramObj = new Anagram();
		
		System.out.println("Is " + subject + " and " + anagram + " anagram : " + anagramObj.VerifyAnagram(subject.toCharArray(), anagram.toCharArray()));
	}

}
