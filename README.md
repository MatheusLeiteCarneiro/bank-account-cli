# Bank Account CLI 🏦

**Description:** `A bank account simulation CLI in Java, demonstrating encapsulation and secure transactional logic.`

This project is a command-line application that simulates the basic operations of a bank account. It was developed as a foundational exercise to implement and understand core Object-Oriented Programming (OOP) principles.

---

## ✨ Features

The system allows the user to:

* **Create an Account:** Initialize a new account with a holder's name and account number.
* **Log Creation Time:** Automatically records the account creation date and time using the `java.time` API.
* **Secure Deposit:** Deposit funds into the account. The system validates that the amount is positive.
* **Secure Withdraw:** Withdraw funds from the account. The system performs two validations:
    1.  The amount must be positive.
    2.  The account must have sufficient balance.
* **Interactive Menu:** A looping menu that allows the user to perform multiple transactions until they choose to exit.
* **View Details:** Display the final account data, including the formatted balance and creation date.

---

## 🛠️ Technologies Used

* **Java 17** (or your version)
* **Eclipse IDE**
* **Git & GitHub** for version control.

---

## 🚀 What I Learned (Concepts Practiced)

This project was fundamental for practicing the following concepts:

* **Object-Oriented Programming (OOP):**
    * **Encapsulation:** This was the core concept. The `accountBalance` is `private`, and all logic for changing it (`deposit`, `withdraw`) is contained *within* the `BankAccount` class. The `Program` class cannot (and does not) change the balance directly.
    * **Constructors:** Using a constructor to ensure a new account is created with all its necessary data.
* **Controlling Program Flow:**
    * Using **`boolean` return types** on methods (`deposit()`, `withdraw()`) to report the success or failure of an operation.
    * Using this `boolean` return to control a `while` loop in the `Program` class, forcing the user to re-enter a valid amount (e.g., `while (!operationWasSuccessful)`).
* **Java APIs:**
    * Using `LocalDateTime` to store a precise timestamp.
    * Using `DateTimeFormatter` to format the date and time neatly in the final `toString()` output.
* **Professional Git Workflow:**
    * Creating a `.gitignore` file to exclude compiled (`.class`) and IDE (`.settings`, `.project`) files from the repository.

---

## 🏁 How to Run

1.  Clone this repository:
    ```bash
    git clone https://github.com/MatheusLeiteCarneiro/bank-account-cli.git
    ```
2.  Open the project in your Java IDE .
3.  Locate and run the `Program.java` file (under `src/application/Program.java`).

---

Author: **Matheus Leite Carneiro**