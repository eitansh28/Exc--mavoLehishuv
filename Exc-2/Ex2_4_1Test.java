package matala2k;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Ex2_4_1Test {

	@Test
	void test() {
		assertEquals(6988812, Ex2_4_1.hex2Dec("6AA40C"));
		assertEquals(5697148, Ex2_4_1.hex2Dec("56EE7C"));
		assertEquals(2724, Ex2_4_1.hex2Dec("AA4"));
		assertEquals(33, Ex2_4_1.hex2Dec("21"));
		assertEquals(46687, Ex2_4_1.hex2Dec("B65F"));
	}

}
