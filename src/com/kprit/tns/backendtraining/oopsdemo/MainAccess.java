package com.kprit.tns.backendtraining.oopsdemo;

public class MainAccess {

	public static void main(String[] args) {
		
		AccessDemo obj = new AccessDemo();
		obj.a = 100;
		// obj.name = "KPRIT"; //Cannot access Private variable
		obj.num=50;
		obj.no = 49;
		obj.print();
	}

}
