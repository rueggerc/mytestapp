package com.rueggerllc.tests.unit;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FooTest {
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
	

	@BeforeMethod
	public void setup() {
		System.out.println("FooTest SETUP");
	}
	
	@Test
	public void errorShouldBeThrownIfNullIsPassedAsParameter() {
		System.out.println("FooTests.errorShouldBeThrownIfNullIsPassedAsParameter");
	}
	
	@Test
	public void testDateStuff() {
		try {
			System.out.println("FooTests.testDateStuff");
			Date date1 = format.parse("2018-05-31T14:55:22-07:00");
			System.out.println("date1=" + date1.getTime());
			
			Date date2 = format.parse("2018-05-31T17:55:22-04:00");
			System.out.println("date2=" + date2.getTime());
			
		} catch (Exception e) {
			System.out.println("ERROR:" + e);
		}
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testCheckException() {
		System.out.println("Test Expected Exceptions");
		int x = 42;
		if (x < 100) {
			System.out.println("Throwing Exception as Expected");
			throw new IllegalArgumentException("RUGE ILLEGAL ARGUMENT");
		}
	}
	
	@Test
	public void testSomeStuff() {
		System.out.println("FooTests.testSomeStuff");
		// serviceBusMock = mock(IServiceBusService.class);
		// restTemplateMock = mock(RestTemplate.class);
		// verify(serviceBusMock,never()).prepareAndSendMemberInfoToServiceBus(any(MemberInfo.class));
	}
	
	
	
}
