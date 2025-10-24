package application;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Matheus' Bank");
		System.out.println("Let's create your account");

		System.out.printf("%nPlease inform your full name: ");
		String accountHolder = sc.nextLine();

		System.out.printf("Now inform the AccountNumber: ");
		Integer accountNumber = sc.nextInt();
		LocalDateTime accountCreationTime = LocalDateTime.now();
		BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, accountCreationTime);
		boolean successfulOperation = true;
		double value = 0.0;
		
		
		System.out.printf("%nLet's make your first deposit%n");
		System.out.print("Please inform the value of the deposit: ");
		value = sc.nextDouble();
		successfulOperation = bankAccount.deposit(value);
		while (!successfulOperation) {
			System.out.print("Please inform a valid value of the deposit: ");
			value = sc.nextDouble();
			successfulOperation = bankAccount.deposit(value);
		}

		
		System.out.printf("%nDo you want to make another operation? type(yes/no)");
		String yesOrNo = sc.next();
		while (yesOrNo.equalsIgnoreCase("yes")) {
			System.out.printf("What's the operation you want to make it? type(deposit/withdraw)");
			String operation = sc.next();

			while (!operation.equalsIgnoreCase("deposit") && !operation.equalsIgnoreCase("withdraw")) {
				System.out.println("invalid response type (deposit or withdraw)");
				operation = sc.next();
			}

			if (operation.equalsIgnoreCase("deposit")) {

				System.out.printf("%nPlease inform the value of the deposit: ");
				value = sc.nextDouble();
				successfulOperation = bankAccount.deposit(value);
				while (!successfulOperation) {
					System.out.print("Please inform a valid value of the deposit: ");
					value = sc.nextDouble();
					successfulOperation = bankAccount.deposit(value);
				}

				System.out.printf("Your actual balance is %.2f%n", bankAccount.getAccountBalance());

			}

			else {
				System.out.printf("%nPlease inform the value of the withdraw: ");
				value = sc.nextDouble();
				successfulOperation = bankAccount.withdraw(value);
				sc.nextLine();
				while (!successfulOperation) {
					System.out.println("Not enough balance or invalid value");
					System.out.printf("Your actual balance is %.2f%n", bankAccount.getAccountBalance());
					System.out.print("Please inform a valid value of the withdraw: ");
					value = sc.nextDouble();
					successfulOperation = bankAccount.withdraw(value);
					sc.nextLine();
				}

				System.out.printf("Your actual balance is %.2f%n", bankAccount.getAccountBalance());
			}

			System.out.printf("%nDo you want to make another operation? type(yes/no)");
			yesOrNo = sc.next();
			while (!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no")) {
				System.out.println("invalid response type (yes or no)");
				yesOrNo = sc.next();
			}
		}

		System.out.println();
		System.out.println("Your final account data: \n" + bankAccount);
		System.out.println("\nThank you for choosing our Bank!");
		sc.close();
	}

}
