package arrays.and.strings;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IsUniqueTest {
	@Before
	public void init() {
	}

	@Test
	public void testIsUniquesDS() {
		assertTrue(IsUnique.isUniqueDS("akm"));
		assertTrue(IsUnique.isUniquesNoDS("akm"));
		assertFalse(IsUnique.isUniqueDS("akk"));
		assertFalse(IsUnique.isUniquesNoDS("akk"));
		
	}

}
