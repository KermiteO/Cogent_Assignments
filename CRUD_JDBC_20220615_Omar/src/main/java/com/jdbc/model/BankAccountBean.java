package com.jdbc.model;

public class BankAccountBean {
	
	private long accountNo;
	private String accountHolderName;
	private String accountType;
	private boolean isactive;
	private double balance;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccountBean(long accountNo, String accountHolderName, String accountType, boolean isactive, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.isactive = isactive;
		this.balance = balance;
	}
	public BankAccountBean() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccountBean [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", isactive=" + isactive + ", balance=" + balance + "]";
	}
	
	
}
