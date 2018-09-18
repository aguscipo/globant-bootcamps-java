package com.globant.bootcamp2018.topic2.exercise2;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {
	
	 @Before
     public void before() {
         System.out.println("Create a simple unit test under src/test/java and run it");
     }

	@Test
	public void isGreaterTest() {
		Demo demo = new Demo();
		assertTrue("Num 1 is greater than Num 2", demo.isGreater(4, 3));
	}

}
