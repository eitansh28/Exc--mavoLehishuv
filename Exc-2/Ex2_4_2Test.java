package matala2k;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex2_4_2Test {

	@Test
	void test() {
		assertEquals("B65F",Ex2_4_2.dec2Hex(46687));
		assertEquals("21",Ex2_4_2.dec2Hex(33));
		assertEquals("AA4",Ex2_4_2.dec2Hex(2724));
		assertEquals("56EE7C",Ex2_4_2.dec2Hex(5697148));
		assertEquals("6AA40C",Ex2_4_2.dec2Hex(6988812));
	}

}
