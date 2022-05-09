package problems.solutions.arrays;

import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


class Duplicate{
	public boolean isDuplicatePresent(int[] arr) {
		Set<Integer> arrSet = new HashSet<>();

//		List<Integer> list = new ArrayList<>();
//		Collections.addAll(arrSet, Collections.addAll(list, Arrays.copyOf(original, newLength)(arr)));
		
		for(int i : arr) {
			arrSet.add(i);
		}
		
		if(arr.length == arrSet.size()) {
			return false;
		}else
			return true;
	}
}


public class DuplicateInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,2,3,4,5};
		Duplicate dupCheck = new Duplicate();
		System.out.println("Is Duplicate : " + dupCheck.isDuplicatePresent(arr));
	}

}
