package com.jdbc.service;

import java.util.List;

import com.jdbc.model.BankAccountBean;

public interface BankAccountService {
	public void openNewAccount(BankAccountBean bankAccount);
	
	public void fundTransfer(BankAccountBean debitor, BankAccountBean creditor, double amount);
	
	public void addFund(BankAccountBean bankAccount, double amount);
	
	public BankAccountBean printAccountDetail(long accountNo);
	
	public List<BankAccountBean> printAllActiveAccounts();
}
