package problems.solutions.codility;

import java.util.ArrayList;
import java.util.Iterator;


// B should be greater than Low Limit
// E should be less than High


class CraneRanges {
    int craneNum;
    int minPosition;
    int maxPosition;
	
    
    
    public CraneRanges(int craneNum) {
		super();
		this.craneNum = craneNum;
	}
    
	public int getCraneNum() {
		return craneNum;
	}
	public void setCraneNum(int craneNum) {
		this.craneNum = craneNum;
	}
	public int getMinPosition() {
		return minPosition;
	}
	public void setMinPosition(int minPosition) {
		this.minPosition = minPosition;
	}
	public int getMaxPosition() {
		return maxPosition;
	}
	public void setMaxPosition(int maxPosition) {
		this.maxPosition = maxPosition;
	}
    
    
}



public class CranesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1, 4, 2], [10, 4, 7], 11, 1
		// [5, 5, 1], [3, 3, 6], 4, 8
		
		int[] A = {5, 5, 1};
		int[] P = {3, 3, 6};
		int B = 4;
		int E = 8;
			
		
		System.out.println(findMovement(A,P,B,E));
	}
	
	public static boolean findMovement(int[] A, int[] P, int B, int E) {
		
		return isMovePossible(calculateRange(A, P),B,E);
	}
	
	public static boolean isMovePossible(ArrayList arrList, int B, int E) {
		
		System.out.println(arrList.size());
		
		if(arrList.size() > 0) {
			Iterator itr = arrList.iterator();
			
			int lowPosition = 0;
			int highPosition = 0;
			
			// Finding Arm Overlapping
			
			while(itr.hasNext()) {
				CraneRanges cr = (CraneRanges)itr.next();
				
				if(lowPosition == highPosition) {
					lowPosition = cr.getMinPosition();
					highPosition = cr.getMaxPosition();			
					
				}else if (cr.getMinPosition() <= highPosition && cr.getMaxPosition() > highPosition) {
					
					highPosition = cr.getMaxPosition();
				
				}else if(cr.getMaxPosition() >= lowPosition && cr.getMinPosition() < lowPosition) {
					lowPosition = cr.getMinPosition();
				}
			}
			
			if(B >= lowPosition && E <= highPosition) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static ArrayList<CraneRanges> calculateRange(int[] A, int[] P) {
		
		ArrayList<CraneRanges> crList = new ArrayList<>();
		
		// Creating Crane Objects with possible minimum and maximum arm length
		
		if(A.length == P.length) {    		
    		for(int i=0; i < P.length; i++) {
    			int minPosition = P[i] - A[i];
    			int maxPosition = P[i] + A[i];
    			
    			CraneRanges cr = new CraneRanges(i);
    			cr.setMinPosition(minPosition);
    			cr.setMaxPosition(maxPosition);
    			crList.add(cr);
    		}
    	}    	
		System.out.println(crList.size());
    	return crList;
    }

}
