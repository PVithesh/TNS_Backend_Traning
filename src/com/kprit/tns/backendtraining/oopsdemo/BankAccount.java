package com.kprit.tns.backendtraining.oopsdemo;
//demo for constructor 
public class BankAccount {
	int accountNumber;
    String accountHolder;
    double balance;

    // Constructor 1
    BankAccount() {
        accountNumber = 636;
        accountHolder = "Unknown";
        balance = 0.0;
    }

    // Constructor 2
    BankAccount(int accNo, String holder) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = 0.0;  
    }

    // Constructor 3: All details provided
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber +", Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}
