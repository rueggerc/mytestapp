package com.rueggerllc.controllers;

import java.util.ArrayList;
import java.util.List;

import com.rueggerllc.beans.GetTransactionsRequest;
import com.rueggerllc.beans.TransactionBean;
import com.rueggerllc.services.BackendTransactionBean;
import com.rueggerllc.services.BackendTransactionService;
import com.rueggerllc.services.BackendTransactionsRequest;

public class RESTController {
	
	private BackendTransactionService backendTransactionService;
	
	public RESTController(BackendTransactionService backendTransactionService) {
		this.backendTransactionService = backendTransactionService;
	}
	
	public List<TransactionBean> getTransactions(GetTransactionsRequest request) {
		BackendTransactionsRequest backendTransactionsRequest = new BackendTransactionsRequest();
		List<BackendTransactionBean> backendTransactions = backendTransactionService.getTransactions(backendTransactionsRequest);
		
		List<TransactionBean> transactions = map(backendTransactions);
		return transactions;
	}
	
	private List<TransactionBean> map(List<BackendTransactionBean> backendTransactions) {
		List<TransactionBean> transactions = new ArrayList<TransactionBean>();
		for (BackendTransactionBean backendTransactionBean : backendTransactions) {
			TransactionBean transactionBean = new TransactionBean();
			transactionBean.setAmount(backendTransactionBean.getAmount());
			transactions.add(transactionBean);
		}
		return transactions;
	}

}
