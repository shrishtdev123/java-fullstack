package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.Calculator;
import com.example.demo.controller.EBBillTest;

@SpringBootTest
class SpringBootTestingApplicationTests {

	
	
	@Test
	public void test() {
		
		
		   int[] arr= {1,2,3,4};
		
		   assertEquals(4,Calculator.findMax(arr));
		 
	}
	@Test
	public void test1() {
		
		 assertEquals(27,Calculator.cube(3));
		
	}
	
	@Test
	public void test2() {
		
		
		   int[] arr= {7,1,2,3,4};
		
		   assertEquals(7,Calculator.findMax(arr));
		 
	}
	
	@Test
	public void test3() {
		
		
		   int[] arr= {7,1,2,3,4};
		
		   assertEquals(1,Calculator.binarySearch(arr, 3));
		 
	}
	
	@Test
	public void TestFirst50unit() {
		
		 assertEquals(130,EBBillTest.findbill(50, 2.60));
	}
	
	@Test
	public void TestFirst150unit() {
		
		 assertEquals(487.5,EBBillTest.findbill(150, 3.25));
	}
	
	@Test
	public void TestFirst350unit() {
		
		 assertEquals(1841,EBBillTest.findbill(350, 5.26));
	}

	@Test
	public void TestFirst1350unit() {
		
		 assertEquals(10462.5,EBBillTest.findbill(1350, 7.75));
	}

}
