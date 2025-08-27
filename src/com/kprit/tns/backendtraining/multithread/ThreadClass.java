package com.kprit.tns.backendtraining.multithread;
//Implementing thread using thread class
public class ThreadClass extends Thread{
	
	public void run() {
		for(int i=0;i<=6;i++) {
			System.out.println("The running Thread "+Thread.currentThread().getName());
		}
	
	
	try {
		sleep(2000); //Milli second
		
	}
	catch(Exception e) {
		System.err.println(e);
	}
	}

}
