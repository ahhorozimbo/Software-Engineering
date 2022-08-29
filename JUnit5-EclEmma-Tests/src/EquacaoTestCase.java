package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class EquacaoTestCase {

	@Test
	void testClass() {
		Equacao e1 = new Equacao();
	}

	@Test
	void test0() {
		int a = 0, b = 2, c = 6;		
		assertThrows(IllegalArgumentException.class, ()->Equacao.getRoots(a, b, c));
	}
	
	@Test
	void test1() {
		int a = 1, b = 4, c = 3;
		double [] expected = {-1, -3};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(Equacao.getRoots(a, b, c)));
	}
	
	@Test
	void test2() {
		int a = 2, b = 4, c = 2;
		double [] expected = {-1};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(Equacao.getRoots(a, b, c)));
	}
	
	@Test
	void test3() {
		int a = 3, b = 1, c = 2;
		double [] expected = {};
		
		assertEquals(Arrays.toString(expected), Arrays.toString(Equacao.getRoots(a, b, c)));
	}
}
