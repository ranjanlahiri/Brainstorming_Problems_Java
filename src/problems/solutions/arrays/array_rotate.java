package problems.solutions.arrays;

class rotateClass{
	void rotate(int arr[], int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}


public class array_rotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {2,4,56,21,77,43,62};
		int length = arr.length;
		int num =2;
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n******************");
		
		rotateClass rotateObj = new rotateClass();
		
		rotateObj.rotate(arr, 0, num-1);
		rotateObj.rotate(arr, num, length-1);
		rotateObj.rotate(arr, 0, length-1);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
