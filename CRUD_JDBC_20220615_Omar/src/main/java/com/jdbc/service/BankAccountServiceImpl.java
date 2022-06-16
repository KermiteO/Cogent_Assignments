package com.jdbc.service;

import java.util.List;

import com.jdbc.dao.BankAccountDaoImpl;
import com.jdbc.model.BankAccountBean;

public class BankAccountServiceImpl implements BankAccountService {

	BankAccountDaoImpl baDoa = new BankAccountDaoImpl();
	
	public void openNewAccount(BankAccountBean bankAccount) {
		baDoa.openNewAccount(bankAccount);
	}

	public void fundTransfer(BankAccountBean debitor, BankAccountBean creditor, double amount) {
		baDoa.fundTransfer(debitor, creditor, amount);
	}

	public void addFund(BankAccountBean bankAccount, double amount) {
		baDoa.addFund(bankAccount, amount);
	}

	public BankAccountBean printAccountDetail(long accountNo) {
		return baDoa.printAccountDetail(accountNo);
	}

	public List<BankAccountBean> printAllActiveAccounts() {
		return baDoa.printAllActiveAccounts();
	}

}
