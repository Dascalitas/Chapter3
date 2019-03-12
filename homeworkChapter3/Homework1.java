package homeworkChapter3;

import java.util.Scanner;

class Account1 {
	private String name;
	private double balance;

	Account1(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	double deposit(double depositSubstraction) {
		if (depositSubstraction < this.balance) {
			this.balance = this.balance - depositSubstraction;
			System.out.println("From your balance we substract " + depositSubstraction);
			return balance;
		} else
			System.out.println("Withdrawal amount exceeded account balance.");
		return depositSubstraction;
	}

	double getBalance() {
		return balance;
	}

	String getName() {
		return this.name;
	}

	void setBalance(double balance) {
		if (balance < 0.0) {
			System.out.println("Withdrawal amount exceeded account balance.");
			return;
		}
		this.balance = balance;
	}

	void setName(String name) {
		this.name = name;
	}

}


public class Homework1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("please,enter your name");
		String myName = input.nextLine();
		System.out.println("please,enter your balance");
		double myBalance = input.nextDouble();

		Account1 My = new Account1(myName, myBalance);

		System.out.println("Enter deposit amount for your account - ");
		double deposit = My.deposit(input.nextDouble());
		System.out.println("Your balance for now - " + My.getBalance());
	}

}


//3.11	(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
//Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print
//a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
//(Fig. 3.9) to test method withdraw