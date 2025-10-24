package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {

	private String accountHolder;
	private Integer accountNumber;
	private double accountBalance;
	private LocalDateTime accountCreationDateTime;

	public BankAccount() {
	}

	public BankAccount(String accountHolder, Integer accountNumber, LocalDateTime accountCreationDateTime) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.accountCreationDateTime = accountCreationDateTime;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public boolean deposit(double value) {
		if (value <= 0.0) {
			return false;
		}
		this.accountBalance += value;
		return true;
	}

	public boolean withdraw(double value) {
		if (value <= 0.0 || this.accountBalance < value) {
			return false;
		}
		accountBalance -= value;
		return true;
	}

	@Override
	public String toString() {
		return "Holder name = " + accountHolder + "\n" + "Account number = " + accountNumber + "\n" + "Final balance = "
				+ String.format("%.2f%n", accountBalance) + "Account creation date = "
				+ accountCreationDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' HH:mm"));
	}

}
