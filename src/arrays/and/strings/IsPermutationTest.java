package arrays.and.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsPermutationTest {

	@Test
	public void testIsPermutation() {
		assertTrue(IsPermutation.isPermutation("abc", "cba"));
		assertFalse(IsPermutation.isPermutation("abc", "abb"));
	}

}
