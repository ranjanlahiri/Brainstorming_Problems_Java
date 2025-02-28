package problems.maze;

/*
Problem Statement :
	count total paths in a maze to move from (0,0) to (n,m)
	where n = m = 3
	
Rules :
	1. One move at a time
	2. Moving allowed rightwards - right side only
	3. Moving allowed downwards only
	
Below Solution has huge time complexity. We will reduce the time complexity through Dynamic Programming later

*/
public class PossiblePathCount {

	public static int countPaths(int i, int j, int n , int m) {
		if(i == n || j == m) {
			return 0;
		}
		if(i == (n-1) && j == (m-1)) {
			return 1;
		}
		return countPaths(i+1,j,n,m) + countPaths(i,j+1,n,m);
	}
	public static void main(String[] args) {
		int n = 3, m = 3;  // 3 X 3 Matrix considered
		
		System.out.println(countPaths(0,0,n,m));
	}

}
