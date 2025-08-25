package com.kprit.tns.backendtraining.exceptiondemo;

public class AtmMain {

	public static void main(String[] args) {
		
		ATM obj = new ATM();
		try {
			obj.validatePin(2231);
			//obj.validatePin(4567);
		}
		catch(InvalidPinException e) {
			e.printStackTrace();
		}
		
		try {
			obj.withdraw(1250000);
			//obj.withdraw(12000);
		}
		
		catch(InsufficientBalException ep) {
			ep.printStackTrace();
		}

	}

}
