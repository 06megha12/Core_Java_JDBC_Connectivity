package com.yash.ATM.System;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;



public class OptionMenu extends Account {

	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException {

		int x = 1;
		do {
			try {
				data.put(111, 101);
				data.put(222, 201);
				data.put(333, 301);
				data.put(444, 401);

				System.out.println("Welcome To the ATM Project !!!");
				System.out.println("Enter Your Customer Number :");
				setCustomerNumber(menuInput.nextInt());

				System.out.println("Enter Your PIN Number : ");
				setPinNumber(menuInput.nextInt());

			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only Number." + "\n");
				x = 2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			} else {
				System.out.println("\n" + "Wrong Customer Number OR Pin Number" + "\n");
			}
		} while (x == 1);

	}

	public void getAccountType() {
		
		System.out.println("Select the Account You Want to Access : ");
		System.out.println("Type 1 :- Checking Account ");
		System.out.println("Type 2 :- Saving Account");
		System.out.println("Type 3 :- Exit");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;

		case 2:
			getSaving();
			break;

		case 3:
			System.out.println("Thank You For Using this ATM, Bye.   \n");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}

	public void getChecking() {

		System.out.println("Checking Account : ");
		System.out.println("Type 1 :- View Balance");
		System.out.println("Type 2 :- Withdraw Funds");
		System.out.println("Type 3 :- Deposit Funds");
		System.out.println("Type 4 :- Exit");
		System.out.println("Choice: ");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You  for Using this ATM, Bye.  ");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();

		}
	}

	public void getSaving() {
		
		System.out.println("Saving Account : ");
		System.out.println("Type 1 :- View Balance");
		System.out.println("Type 2 :- Withdraw Funds");
		System.out.println("Type 3 :- Deposit Funds");
		System.out.println("Type 4 :- Exit");
		System.out.println("Choice: ");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingsBalance()));
			getAccountType();
			break;

		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getSavingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank You for Using this ATM, Bye. ");
			break;

		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getSaving();
		}
	}

}
