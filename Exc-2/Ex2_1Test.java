package matala2k;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Ex2_1Test {

	@Test
	void test() {
		int[]arr0= {2,2,2,3,3};
		Assert.assertArrayEquals(arr0, Ex2_1.primeDividers(72));
		int[]arr1= {2};
		Assert.assertArrayEquals(arr1, Ex2_1.primeDividers(2));
		int[]arr2= {};
		Assert.assertArrayEquals(arr2, Ex2_1.primeDividers(0));
		int[]arr3= {3,3,11};
		Assert.assertArrayEquals(arr3, Ex2_1.primeDividers(99));
		int[]arr4= {};
		Assert.assertArrayEquals(arr4, Ex2_1.primeDividers(1));
		int[]arr5= {2,2,7,11,13};
		Assert.assertArrayEquals(arr5, Ex2_1.primeDividers(4004));
	}

}
