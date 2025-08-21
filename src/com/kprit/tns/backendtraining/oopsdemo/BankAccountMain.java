package com.kprit.tns.backendtraining.oopsdemo;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount(4514, "Vamshi");
        BankAccount acc3 = new BankAccount(1023, "Shiva", 5000.0);

        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();

	}

}
