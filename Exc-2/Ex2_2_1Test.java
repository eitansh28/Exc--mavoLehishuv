package matala2k;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Ex2_2_1Test {

	@Test
	void test() {
		assertTrue(Ex2_2_1.isPerfect(6));
		assertTrue(Ex2_2_1.isPerfect(28));
		assertFalse(Ex2_2_1.isPerfect(5));
		assertFalse(Ex2_2_1.isPerfect(0));
		assertTrue(Ex2_2_1.isPerfect(496));
	}

}
