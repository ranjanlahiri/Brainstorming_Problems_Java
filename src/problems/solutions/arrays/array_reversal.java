package problems.solutions.arrays;

import java.util.ArrayList;
import java.util.List;

class ReverseArr{
	
	public int [] reverse(int a[], int n) {
		int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j--;
        }
       	return b;
	}
}


public class array_reversal {

	public static void main(String[] args) {
		int arr[] = {2,4,56,21,77,43,62};
		int length = arr.length;
		ReverseArr revObj = new ReverseArr();
		arr = revObj.reverse(arr, length);
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
