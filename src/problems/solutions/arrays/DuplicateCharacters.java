package problems.solutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String subject = "Ranjan";

		char[] arr = subject.toLowerCase().trim().toCharArray();
		
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		
		for(char ch : arr) {
			if(baseMap.containsKey(ch)) {				
				baseMap.put(ch, baseMap.get(ch) + 1);
			}else {
				baseMap.put(ch, 1);				
			}
		}
		baseMap.keySet().stream().filter(s -> (baseMap.get(s) > 1)).forEach(e -> System.out.println(e + " count : " + baseMap.get(e)));
		//baseMap.keySet().stream().forEach(e -> System.out.println(e + " count : " + baseMap.get(e)));
	}
}