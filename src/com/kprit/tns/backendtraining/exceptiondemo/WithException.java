package com.kprit.tns.backendtraining.exceptiondemo;

public class WithException {

	public static void main(String[] args) {
		
		try {
			int k = 32/2;
			//int k = 32/0;
			System.out.println("The result is: "+k);
			
			int arr[] = new int[6];
			arr[7] = 67;
			System.out.println("The result is: "+arr[7]);
		}
		catch(ArithmeticException e) {
			System.err.println("You can't divide a number with zero. "+ "Enter a positive number");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("The defined index is not existing !!");
		}
	}

}
