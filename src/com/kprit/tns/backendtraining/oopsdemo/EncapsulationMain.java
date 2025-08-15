package com.kprit.tns.backendtraining.oopsdemo;

public class EncapsulationMain {

	public static void main(String[] args) {
		EncapsulationDemo ob = new EncapsulationDemo();
		ob.setSid(101);
		System.out.println(ob.getSid());
		
		ob.setSname("KPRIT");
		System.out.println(ob.getSname());
		
	}

}
