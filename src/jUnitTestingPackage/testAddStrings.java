package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunctions junitStrings = new jUnitFunctions();
		String result = junitStrings.addStrings("Rushali ", "Patel");
		assertEquals ("Rushali Patel", result);
	}

}
