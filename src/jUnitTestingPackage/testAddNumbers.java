package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(60, 40);
		assertEquals (100, result);
	}

}
