package problems.solutions.arrays;



class TestString {
    public boolean solution(String S) {
    	
        String a = "a";
        String b = "b";
        
        
        if(S.endsWith(a) && S.contains(b)) {
        	return false;
        }else if(S.endsWith(b) && (!S.contains(a))) {
        	return true;
        }else if(S.endsWith(a) && (!S.contains(b))) {
        	return true;
        }else if(S.endsWith(b) && (S.contains(a) && S.startsWith(a))) {
        	return true;
        }
        
        return false;
    }
}
public class StringTest {

	public static void main(String[] args) {
		TestString ts = new TestString();
		
		System.out.println("aabbb  " + ts.solution("aabbb"));
		System.out.println("abba  " + ts.solution("abba"));
		System.out.println("aabbb  " + ts.solution("aabbb"));
		System.out.println("aaa  " + ts.solution("aaa"));
		System.out.println("bbb  " + ts.solution("bbb"));
	}

}
