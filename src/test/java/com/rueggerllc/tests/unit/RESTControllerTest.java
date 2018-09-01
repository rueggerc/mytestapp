package com.rueggerllc.tests.unit;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rueggerllc.beans.GetTransactionsRequest;
import com.rueggerllc.beans.TransactionBean;
import com.rueggerllc.controllers.RESTController;
import com.rueggerllc.services.BackendTransactionBean;
import com.rueggerllc.services.BackendTransactionService;

public class RESTControllerTest {
	
	@Mock
	private BackendTransactionService backendTransactionService;
	
	@InjectMocks
	RESTController controller;
	
	@BeforeMethod
	public void beforeMethodSetup() {
		System.out.println("BeforeMethod Setup");
		MockitoAnnotations.initMocks(this);
		System.out.println("Create Controller BackendService=" + backendTransactionService);
		controller = new RESTController(backendTransactionService);
	}
	
	@Test
	public void getTransactionsBasic() {
		
		when(backendTransactionService.getTransactions(any()))
		.thenReturn(getDummyTransactions());
		GetTransactionsRequest request = new GetTransactionsRequest();
		List<TransactionBean> transactions = controller.getTransactions(request);
		assertThat(transactions).isNotEmpty().hasSize(3);
		
		System.out.println("Test Passed");
		
		
	}
	
	private List<BackendTransactionBean> getDummyTransactions() {
		List<BackendTransactionBean> dummyTransactions = new ArrayList<BackendTransactionBean>();
		for (int i = 0; i < 3; i++) {
			BackendTransactionBean backendTransactionBean = new BackendTransactionBean();
			dummyTransactions.add(backendTransactionBean);
		}
		return dummyTransactions;
	}
	

}
