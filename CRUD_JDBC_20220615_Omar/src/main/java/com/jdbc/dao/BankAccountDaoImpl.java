package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.jdbc.model.BankAccountBean;
import com.jdbc.util.DbUtil;
import com.jdbc.util.InsufficientBalanceException;

public class BankAccountDaoImpl implements BankAccountDao {

	public void openNewAccount(BankAccountBean bankAccount) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		if(bankAccount.getAccountHolderName().length() <= 30) {
			try {
				con = DbUtil.getConnection();
				String query = "INSERT INTO BankAccount_tb1 VALUES(?,?,?,?,?)";

				stmt= con.prepareStatement(query);
				
				stmt.setLong(1, bankAccount.getAccountNo());
				stmt.setString(2, bankAccount.getAccountHolderName());
				stmt.setString(3, bankAccount.getAccountType());
				stmt.setBoolean(4, bankAccount.isIsactive());
				stmt.setDouble(5, bankAccount.getBalance());
				
				stmt.execute();
				
				System.out.println("New account successfully opened!\n");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DbUtil.closeConnection(con, stmt);
			}
		}
		else
			System.out.println("*** ERROR - Max Name length exceeds 30! Re-enter new account info ***");
	}

	public void fundTransfer(BankAccountBean debitor, BankAccountBean creditor, double amount) {
		Connection con = null;
		Statement stmt = null;
		
		if(debitor.isIsactive() && creditor.isIsactive()) {
			try {
				con = DbUtil.getConnection();
				stmt= con.createStatement();
				
				if(debitor.getBalance() - amount > 0) {
					debitor.setBalance(debitor.getBalance() - amount);
					creditor.setBalance(creditor.getBalance() + amount);
				}
				else
					throw new InsufficientBalanceException("Insufficient debitor funds");
				
				
				String query = "UPDATE BankAccount_tb1 SET balance='"+debitor.getBalance()+"' WHERE accountNo= '"+debitor.getAccountNo()+"'";
				String query2 = "UPDATE BankAccount_tb1 SET balance='"+creditor.getBalance()+"' WHERE accountNo= '"+creditor.getAccountNo()+"'";
	
				stmt.execute(query);
				stmt.execute(query2);
				
				
				System.out.println("Funds successfully tranferred!");
				System.out.print("final debitor balance : " + debitor.getBalance());
				System.out.print("\nfinal creditor balance: " + creditor.getBalance()+"\n");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DbUtil.closeConnection(con, stmt);
			}
		}
		else {
			System.out.println("*** ERROR - One or more accounts not active ***");
		}
			
	}

	public void addFund(BankAccountBean bankAccount, double amount) {
		Connection con = null;
		Statement stmt = null;
		
		bankAccount.setBalance(bankAccount.getBalance() + amount);
		
		try {
			con = DbUtil.getConnection();
			stmt= con.createStatement();
			
			String query = "UPDATE BankAccount_tb1 SET balance='"+bankAccount.getBalance()+"' WHERE accountNo= '"+bankAccount.getAccountNo()+"'";
		
			stmt.execute(query);
			
			System.out.println("Funds successfully added to account #" + bankAccount.getAccountNo() + "\n");			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(con, stmt);
		}
	}

	public BankAccountBean printAccountDetail(long accountNo) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		BankAccountBean account = null;
		
		try {
			con = DbUtil.getConnection();
			stmt= con.createStatement();
			
			String query = "select * from BankAccount_tb1 where accountNo = '"+accountNo+"'";
		
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				account = new BankAccountBean(rs.getLong(1),
											  rs.getString(2),
											  rs.getString(3),
											  rs.getBoolean(4),
											  rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(con, stmt, rs);
		}
		
		return account;
	}

	public List<BankAccountBean> printAllActiveAccounts() {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<BankAccountBean> list = new ArrayList<BankAccountBean>();
		
		try {
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			
			String query = "select * from BankAccount_tb1";
			rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				list.add(new BankAccountBean(rs.getLong(1),
											 rs.getString(2),
											 rs.getString(3),
											 rs.getBoolean(4),
											 rs.getDouble(5)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtil.closeConnection(con, stmt, rs);
		}
		
		
		return list;
	}

}
