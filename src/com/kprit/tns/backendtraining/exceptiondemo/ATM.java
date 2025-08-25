package com.kprit.tns.backendtraining.exceptiondemo;

public class ATM {
	
	private double bal = 100000.905;
	private final int spin = 4567;
	
	public void validatePin(int epin) throws InvalidPinException{
		
		if(spin != epin) {
			throw new InvalidPinException("Entered Pin is Invalid");
		}
		else {
			System.out.println("Entered pin is correct..!Proceed");
		}
	}
	
	public void withdraw(double amt)throws InsufficientBalException{
		
		if(amt>bal) {
			throw new InsufficientBalException("Insufficient Balance../");
		}
		else {
			bal -= amt;
			System.out.println("Updated Balance: "+bal);
		}
	}

}
