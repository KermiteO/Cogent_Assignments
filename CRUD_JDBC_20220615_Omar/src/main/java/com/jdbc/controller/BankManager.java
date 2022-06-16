package com.jdbc.controller;

import java.util.Scanner;

import com.jdbc.model.BankAccountBean;
import com.jdbc.service.BankAccountService;
import com.jdbc.service.BankAccountServiceImpl;

public class BankManager {

	 final static String menu = "1 - open new account\n" +
				"2 - transfer funds\n" +
				"3 - add fund\n" +
				"4 - print account details\n" +
				"5 - print all accounts\n" +
				"6 - exit";
	 BankAccountService bankService = new BankAccountServiceImpl();

	public static void main(String[] args) {
		int menuChoice = 0;
		long accNo = 0;
		long accNo2 = 0;
		double funds = 0;
		Scanner input = new Scanner(System.in);
		BankManager bm = new BankManager();
		
		System.out.println(menu);
		System.out.print("Enter choice: ");
		menuChoice = input.nextInt();
		input.nextLine();
		
		while(menuChoice != 6)
		{
			switch(menuChoice)
			{
			case 1: BankAccountBean acc = bm.addAccount(input);
					bm.bankService.openNewAccount(acc);
					break;
			case 2: System.out.print("Enter debitor account number: ");
					accNo = input.nextLong();
					input.nextLine();
					acc = bm.bankService.printAccountDetail(accNo);
					System.out.print("Enter creditor account number: ");
					accNo2 = input.nextLong();
					BankAccountBean receiver = bm.bankService.printAccountDetail(accNo2);
					input.nextLine();
					System.out.print("Enter transfer fund: ");
					funds = input.nextDouble();
					input.nextLine();
					bm.bankService.fundTransfer(acc, receiver, funds);
					break;
			case 3: System.out.print("Enter account number: ");
					accNo = input.nextLong();
					input.nextLine();
					System.out.print("Enter new funds: ");
					funds = input.nextDouble();
					input.nextLine();
					acc = bm.bankService.printAccountDetail(accNo);
					bm.bankService.addFund(acc, funds);
					break;
			case 4: System.out.print("Enter account number: ");
					accNo = input.nextLong();
					input.nextLine();
					System.out.println(bm.bankService.printAccountDetail(accNo));
					break;
			case 5: System.out.println("Printing all bank accounts...");
					System.out.println(bm.bankService.printAllActiveAccounts().toString());
					break;
			case 6: break;
			default: System.out.println("*** ERROR - INVALID OPTION ***");
			
			}
			System.out.println(menu);
			System.out.print("Enter choice: ");
			menuChoice = input.nextInt();
			input.nextLine();
		}
		
		System.out.println("ENDING PROGRAM...");
	}

	BankAccountBean addAccount(Scanner input) 
	{
		BankAccountBean account = new BankAccountBean();
		
		System.out.println("Enter account number:");
		account.setAccountNo(input.nextLong());
		input.nextLine();
		System.out.println("Enter account holder name:");
		account.setAccountHolderName(input.nextLine());
		System.out.println("Enter account type(Current/Saving):");
		account.setAccountType(input.nextLine());
		System.out.println("Enter opening balance:");
		account.setBalance(input.nextDouble());
		input.nextLine();
		account.setIsactive(true);
		
		return account;
	}

}
