# Banking-System
This repository contains a simple Java implementation of a banking system. The system includes two types of bank accounts: Savings Account and Checking Account, each implementing a common interface named Bank_interface. The project is structured with clarity, following best practices and adhering to proper code documentation.

# Project_Structure:

1. Bank_interface.java
Defines the Bank_interface interface with methods for deposit, withdrawal, and fetching the account balance.

2. SavingsAccount.java
Implements the Bank_interface for Savings Accounts.
Provides methods for depositing, withdrawing, and checking the balance.
Handles scenarios where the account balance is insufficient during a withdrawal.

3. CheckingAccount.java
Implements the Bank_interface for Checking Accounts.
Similar to SavingsAccount, it supports deposit, withdrawal, and balance inquiry.
Includes appropriate checks for withdrawal to ensure account sufficiency.

4. Banking.java
The main class demonstrating the functionality of both Savings and Checking accounts.
Illustrates the deposit and withdrawal operations, providing real-time feedback on the account balances.
