package arrays.and.strings;

import java.util.Arrays;

public class IsPermutation {
	// O(nlogn) for sorting + O(n) for iteration and comparing
	public static boolean isPermutation(String a, String b) {
		if(a.length() != b.length()) return false;
		if(a.equals(b)) return true;
		
		char[] arrA = a.toCharArray();
		char[] arrB = b.toCharArray();
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		for(int i = 0; i < arrA.length; i++) {
			if(arrA[i] != arrB[i]) return false;
		}
		
		return true;
	}
}
