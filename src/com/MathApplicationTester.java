package com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class MathApplicationTester {

	
	
	@InjectMocks
	MathApplication mathApplication;

	@Mock
	CalculatorService calcService;

	@Before
	public void init() {
	    MockitoAnnotations.initMocks(this);
	}
	
	@Test
	@Test(expected=MyException.class)
	public void testAdd() {
		String add = mathApplication.add("vishal");
		verify(calcService).add("vishal");
		when(calcService.add("ggg")).thenReturn("ggg");
		//Mockito.verify(calcService.m1());
		
		given(otherServiceMock.bar()).willThrow(new MyException());
		when(myMock.doSomething()).thenThrow(new MyException());
	}
}
