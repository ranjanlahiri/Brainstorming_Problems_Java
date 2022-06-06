package problems.solutions.codility;

import java.util.Arrays;

/*
This program used to find smallest positive integer that is not present in the array 
*/
class FindSmallestInt {
    public int solution(int[] A) {
        int result = 1;
        Arrays.sort(A);
        for(int val : A){
            if(val == result){
                result++;
            }
        }
        return result;
    }
}

public class SmallestIntegerNotPresentInArray {
	public static void main(String [] args) {
		int [] A = {0,1,3,4,6};
		FindSmallestInt obj = new FindSmallestInt();
		System.out.println("Smallest Integer : " + obj.solution(A));
		
	}
}
