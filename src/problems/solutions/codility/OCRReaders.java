package problems.solutions.codility;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


class OCRTest{
	public boolean solution(String S, String T) {
	    
	    // If String length are not equal
		//System.out.println("Length 1 : " + findLength(S));
		//System.out.println("Length 2 : " + findLength(T));
		
		if(findLength(S)  != findLength(T)) {
			return false;
		}else {
			
		}
		return true;
	}
	
	public int findTotalNumbers(String param) {
		//char[] arrChar = param.toCharArray();
		//List<Character> listChar = new ArrayList<Character>();
		
		List<Character> listChar = Arrays.asList('0','1','2','3','4','5','6','7','8','9');
		//List<String> listChar = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
		int total = 0;		
		//HashSet<Character> numFilter = new HashSet<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9')); 
		//String intStr = param.chars().filter(i -> numFilter.contains(i)).toString();
		//StringBuffer numStr = new StringBuffer();
		
		for(int i = 0; i < param.length() ; i++) {
			if(listChar.contains(param.charAt(i))) {
				
				total += Integer.parseInt(param.valueOf(param.charAt(i)));
			}
		}	
		System.out.println("Number Total of "+ param  +" : " + total);		 	
		return total;
	}
	
	public int charLength(String param) {
		char[] arrChar = param.toCharArray();	
		
		List<Character> listChar = Arrays.asList('0','1','2','3','4','5','6','7','8','9');		
		
		StringBuffer numStr = new StringBuffer();
		for(char ch : arrChar) {
			if(!listChar.contains(ch)) {
				numStr.append(ch);
			}
		}	
		//System.out.println("Character Length of "+ param  +" : " + numStr.length());		 	
		return numStr.length();
	}
	
	public int findLength(String param) {		
		return (findTotalNumbers(param) + charLength(param));
	}
}

public class OCRReaders {

	public static void main(String[] args) {
		
		String S = "2pL1";
		String T = "A2Le";
		
		OCRTest ocr = new OCRTest();
		
		System.out.println(ocr.solution(S, T));
	}

}
