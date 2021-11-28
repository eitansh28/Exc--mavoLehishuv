package matala2k;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Ex2_2_2Test {

	@Test
	void test() {
		int[]arr0= {6,28};
		Assert.assertArrayEquals(arr0, Ex2_2_2.PerfectNumbers(30));
		int[]arr1= {6};
		Assert.assertArrayEquals(arr1, Ex2_2_2.PerfectNumbers(6));
		int[]arr2= {};
		Assert.assertArrayEquals(arr2, Ex2_2_2.PerfectNumbers(5));
		int[]arr3= {6,28,496};
		Assert.assertArrayEquals(arr3, Ex2_2_2.PerfectNumbers(500));
		int[]arr4= {};
		Assert.assertArrayEquals(arr4, Ex2_2_2.PerfectNumbers(0));
	}

}
