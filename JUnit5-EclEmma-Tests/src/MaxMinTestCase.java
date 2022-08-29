package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxMinTestCase {

	@Test
	void testClass() {
		MaxMin mm1 = new MaxMin();
	}

	@Test
	void test0() {
		int [] val = {};
		
		assertThrows(IllegalArgumentException.class, ()->MaxMin.maxmin(val));
	}
	
	@Test
	void test1() {
		int [] val = {1, 3, 6, 5, -2};
		int [] expected = {6, -2};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(MaxMin.maxmin(val)));
	}
}
