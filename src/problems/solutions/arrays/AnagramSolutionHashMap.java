package problems.solutions.arrays;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }
        
        for(Character c : sMap.keySet()) {
            if(!sMap.get(c).equals(tMap.get(c))) return false;
        }
        return true;
    }
}

public class AnagramSolutionHashMap {

	public static void main(String[] args) {
		String s = "restful";
		
		String t = "fluster";
		
		Solution anagramObj = new Solution();
		
		System.out.println("Is " + s + " and " + t + " anagram : " + anagramObj.isAnagram(s, t));


	}

}
