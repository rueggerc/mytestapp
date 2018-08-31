package com.rueggerllc.tests.integration;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FooBarIntegrationTestIT {

	@BeforeMethod
	public void setup() {
		System.out.println("FooTest SETUP");
	}
	
	@Test
	public void errorShouldBeThrownIfNullIsPassedAsParameter() {
		System.out.println("FooTests.errorShouldBeThrownIfNullIsPassedAsParameter");
	}
	
	
	
}
