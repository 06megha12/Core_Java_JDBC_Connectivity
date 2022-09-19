package com.yash.ATM.System;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ATM extends OptionMenu {

	public static void main(String[] args) throws IOException, Exception {

		Account a=new Account();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc?useSSL=false","root","root");
		
		PreparedStatement stmt = connection.prepareStatement("insert into account values(?,?,?,?)");
		stmt.setInt(1, 1111);
		stmt.setInt(2, 1011);
		stmt.setInt(3, 500);
		stmt.setInt(4, 1000);
		/*
		 * stmt.setInt(1,a.getCustomerNumber()); stmt.setInt(2, a.getPinNumber() );
		 * stmt.setDouble(3, a.getCheckingBalance()); stmt.setDouble(4,
		 * a.getSavingsBalance());
		 */
		int i=stmt.executeUpdate();
		
		/*
		 * ResultSet resultset=stmt.executeQuery("insert into account");
		 * 
		 * //resultset=stmt.
		 * executeQuery("insert from account(customerNumber,pinNumber,checkingBalance,savingBalance) value(?,?,?,?)"
		 * ); while(resultset.next()) {
		 * System.out.println(resultset.getInt(1)+" "+resultset.getInt(2)+" "+resultset.
		 * getInt(3)+" "+resultset.getInt(4)); }
		 */
		connection.close();
		
		OptionMenu optionMenu = new OptionMenu();

		optionMenu.getLogin();
		}

}
