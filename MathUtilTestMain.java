package com.tyss.junit.junitjupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTestMain {

	@Test
	void testAddNum() {
		MathUtil mutil=new MathUtil(); 
		int exp=10;
		int actu=mutil.addNum(5,5);
		assertEquals(exp, actu,"test fail");
		//fail("Not yet implemented");
	}
	@Test
	void testDiv() {
		MathUtil mutil=new MathUtil(); 
		assertThrows(ArithmeticException.class, ()->mutil.div(10,0));
		
	}
	
	

}
