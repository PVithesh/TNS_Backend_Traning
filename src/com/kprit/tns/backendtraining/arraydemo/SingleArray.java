package com.kprit.tns.backendtraining.arraydemo;

public class SingleArray {

	public static void main(String[] args) {
		//declaration of an array
		int[] arr;
		
		//declaration + initialization
		int ar[] = {1,23,45,87};
		int []number = new int[5];
		number[0] = 203;
		number[1] = 342;
		number[2] = 67;
		number[3] = 89;
		number[4] = 92;
		
		//enhanced for loop (from version 8)
		for(int num:ar) {
			System.out.println("The elements in the  array: "+num);
		}
		System.out.println();
		for(int i=0;i<number.length;i++) {
			System.out.println("The elements in the array: "+number[i]);
		}
		

	}

}
