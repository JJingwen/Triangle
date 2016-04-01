import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangle {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		long a = 0;
		long b = 0;
		long c = -1;
		Triangle tri = new Triangle (a,b,c);
		assertEquals(false, tri.isTriangle(tri));
		
		assertEquals("Illegal", tri.getType(tri));
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		long a = 3;
		long b = 3;
		long c = 3;
		Triangle tri = new Triangle (a,b,c);
		assertEquals(true, tri.isTriangle(tri));
		
		assertEquals("Regular", tri.getType(tri));
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
		long a = 3;
		long b = 2;
		long c = 3;
		Triangle tri = new Triangle (a,b,c);
		assertEquals(true, tri.isTriangle(tri));
		
		
		assertEquals("Isosceles", tri.getType(tri));
		
		long [] aaa = {3,2,3};
		assertArrayEquals(aaa, tri.getBorders());
		
	}
	
	@Test
	public void test4() {
		//fail("Not yet implemented");
		long a = 9;
		long b = 5;
		long c = 8;
		Triangle tri = new Triangle (a,b,c);
		assertEquals(true, tri.isTriangle(tri));
		
		assertEquals( "Scalene", tri.getType(tri));
	}

}
