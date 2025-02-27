package problems.solutions.leetcode.NumberProblems;

public class NumberSwappingWithoutVariable {

	public static void main(String[] args) {
		int a = 10;
        int b = 20;
        
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        // Swapping Without Using Third Variable
        a = b - a;
        b = b - a;
        a = a + b;
        
        System.out.println("After swapping, a = " + a + " and b = " + b);

	}

}
