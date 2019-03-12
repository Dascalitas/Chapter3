package homeworkChapter3;

import java.util.Scanner;

class Account {
	private String name;
	private double balance;

	Account(String name, double balance) {
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

public class Homework5 {

	    public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		displayAccount(account1);
		displayAccount(account2);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

		input.close();
	}

	public static void displayAccount(Account account) {
		System.out.printf("%s balance: $%.2f%n%n", account.getName(), account.getBalance());
	}

}

//3.15	(Removing Duplicated Code in Method main) In the AccountTest class of Fig. 3.9, method
//main contains six statements (lines 13�14, 15�16, 28�29, 30�31, 40�41 and 42�43) that each display an Account object�s name and balance. 
//Study these statements and you�ll notice that they differ only in the Account object being manipulated�account1 or account2.
//In this exercise, you�ll define a new displayAccount method that contains one copy of that output statement. 
//The method�s parameter will be an Account object and the method will output the object�s name and balance. You�ll
//then replace the six duplicated statements in main with calls to displayAccount, passing as an argument the specific Account object to output.
//Modify class AccountTest class of Fig. 3.9 to declare the following displayAccount method
//after the closing right brace of main and before the closing right brace of class AccountTest:
//public static void displayAccount(Account accountToDisplay)
//{
// // place the statement that displays
// // accountToDisplay's name and balance here
//}
//Replace the comment in the method�s body with a statement that displays accountToDisplay�s
//name and balance.
//Recall that main is a static method, so it can be called without first creating an object of the
//class in which main is declared. We also declared method displayAccount as a static method.
//When main needs to call another method in the same class without first creating an object of that
//class, the other method also must be declared static.
//Once you�ve completed displayAccount�s declaration, modify main to replace the statements
//that display each Account�s name and balance with calls to displayAccount�each receiving as its
//argument the account1 or account2 object, as appropriate. Then, test the updated AccountTest
//class to ensure that it produces the same output as shown in Fig. 3.9.