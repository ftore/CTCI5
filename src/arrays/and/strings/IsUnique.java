package arrays.and.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsUnique {
	// O(n) - time
	// O(n) - space
	public static boolean isUniqueDS(String a) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if(map.containsKey(c)) {
				return false;
			} else {
				map.put(c, 1);
			}
		}
		
		return true;
	}
	
	
	public static boolean isUniquesNoDS(String a) {
		char[] c = a.toCharArray();
		Arrays.sort(c);
		for(int i = 1; i < c.length; i++) {
			if(c[i] == c[i-1]) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
	}
}
