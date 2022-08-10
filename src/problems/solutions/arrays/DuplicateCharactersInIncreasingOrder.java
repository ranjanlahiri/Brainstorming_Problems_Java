package problems.solutions.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInIncreasingOrder {

	public static void main(String[] args) {
		//String subject = "Ranjan";
		
		String subject = "ddddduukkkwwwwy";

		char[] arr = subject.toLowerCase().trim().toCharArray();
		
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		
		for(char ch : arr) {
			if(baseMap.containsKey(ch)) {				
				baseMap.put(ch, baseMap.get(ch) + 1);
			}else {
				baseMap.put(ch, 1);				
			}
		}
		
		baseMap.keySet().stream().sorted(Comparator.comparingInt(e -> baseMap.get(e))).forEach(e -> System.out.print(baseMap.get(e)+ "" + e));

	}

}
