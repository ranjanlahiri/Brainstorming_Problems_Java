package problems.solutions.codility;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

/*
Problem Statement : This program shows the longest common suffix and prefix
Example 1 : String = "codility"

Prefix = ["c","co","cod","codi", "codil","codili","codilit","codility"]
suffix = ["y","yt","yti","ytil","ytili","ytilid","ytilido","ytilidoc"]

Since, there is no matching / common substring in suffix and prefix result will be 0

However, if there is / are matching substrings then program will output the longest substring

Example 2 :
String = "aaabbabb"

Prefix = ["a","aa","aaa","aaab", "aaabb","aaabba","aaabbab","aaabbabb"]
suffix = ["b","bb","bba","bbab","bbabb","bbabba","bbabbaa","bbabbaaa"]

Expected Result = 0

Example 3 :
String = "aabbaa"

Prefix = ["a","aa","aab","aabb", "aabba","aabbaa"]
suffix = ["a","aa","aab","aabb","aabba","aabbaa"]

Expected Result = 6

*/

class SuffixPrefixSolution {
   
	public int findSolution(String S) {
    	int lengthStr = 0;		
    	Map<String, Integer> baseMap	= intializeSuffix(S, intializePrefix(S));
    		
    	List<String> arrList = baseMap.keySet()
				.stream()
				.filter(s -> (baseMap.get(s) > 1))
				.collect(Collectors.toList());				

/*		
		  if(arrList.size() > 0) { 
			  for(String str : arrList) { 
				  if(str.length() > lengthStr) { 
					  lengthStr = str.length(); 
				  } 
			  } 
		  }
*/

//    	arrList.forEach(System.out :: println);
    	
    	if(arrList.size() > 0) { 
    		lengthStr = arrList.stream()
	    						.mapToInt(s -> s.length())
	    						.max()
	    						.getAsInt();
    	}	
    						
        return lengthStr;
    }
    
    public HashMap<String, Integer> intializePrefix(String S) {
    	
    	HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
    	char[] charArr = S.toCharArray();
        
        StringBuffer subStr = new StringBuffer();

        for(int i = 0; i < charArr.length-1 ; i++) {
        	subStr.append(charArr[i]);
        	System.out.println(subStr);
        	if(tempMap.containsKey(subStr.toString())) {				
        		tempMap.put(subStr.toString(), tempMap.get(subStr.toString()) + 1);
			}else {
				tempMap.put(subStr.toString(), 1);				
			}
        }
        System.out.println("============================================");
        return tempMap;
    } 
    
    
    public HashMap<String, Integer> intializeSuffix(String S, HashMap<String, Integer> mapParam) {
    	       
    	char[] charArr = S.toCharArray();     
    	
    	StringBuilder strBuild = new StringBuilder();
        for(int i = charArr.length-1 ; i>=1 ; i--) {
        	strBuild.insert(0, charArr[i]);
        	System.out.println(strBuild);
        	if(mapParam.containsKey(strBuild.toString())) {				
        		mapParam.put(strBuild.toString(), mapParam.get(strBuild.toString()) + 1);
			}else {
				mapParam.put(strBuild.toString(), 1);				
			}
        }    
        return mapParam;
    }
}


public class SuffixPrefix {

	public static void main(String[] args) {
		
		String str = "codility";
		
		String str1 = "abbabba";
		
		String str2 = "abba";
		
		SuffixPrefixSolution obj = new SuffixPrefixSolution();
		
		System.out.println(obj.findSolution(str2));
		
	}

}
