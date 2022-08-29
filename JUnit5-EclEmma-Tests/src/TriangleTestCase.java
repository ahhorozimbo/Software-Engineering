package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTestCase {
	
	@Test
	void testClass() {
		Triangle t1 = new Triangle();
	}
	
	@Test
	void test0A() {
		int a = 10, b = 2, c = 6;
		
		assertEquals(0, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test0B() {
		int a = 2, b = 10, c = 6;
		
		assertEquals(0, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test0C() {
		int a = 6, b = 2, c = 10;
		
		assertEquals(0, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test1() {
		int a = 5, b = 4, c = 3;
		
		assertEquals(1, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test2A() {
		int a = 12, b = 16, c = 12;
		
		assertEquals(2, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test2B() {
		int a = 12, b = 12, c = 16;
		
		assertEquals(2, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test2C() {
		int a = 16, b = 12, c = 12;
		
		assertEquals(2, Triangle.triangle(a, b, c));
	}
	
	@Test
	void test3() {
		int a = 7, b = 7, c = 7;
		
		assertEquals(3, Triangle.triangle(a, b, c));
	}
}
