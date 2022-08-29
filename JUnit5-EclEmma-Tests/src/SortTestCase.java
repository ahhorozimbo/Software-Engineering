package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortTestCase {

	@Test
	void testClass() {
		Sort s1 = new Sort();
	}
	
	@Test
	void test() {
		int [] value = {4, 3, 12, 8, 9, 15, 18};
		Sort.sort(value);
	}
}
