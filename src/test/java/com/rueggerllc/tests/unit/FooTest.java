package com.rueggerllc.tests.unit;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FooTest {

	@BeforeMethod
	public void setup() {
		System.out.println("FooTest SETUP");
	}
	
	@Test
	public void errorShouldBeThrownIfNullIsPassedAsParameter() {
		System.out.println("FooTests.errorShouldBeThrownIfNullIsPassedAsParameter");
	}
	
	@Test
	public void testSomeStuff() {
		System.out.println("FooTests.testSomeStuff");
		// serviceBusMock = mock(IServiceBusService.class);
		// restTemplateMock = mock(RestTemplate.class);
		// verify(serviceBusMock,never()).prepareAndSendMemberInfoToServiceBus(any(MemberInfo.class));
	}
	
	
	
}
