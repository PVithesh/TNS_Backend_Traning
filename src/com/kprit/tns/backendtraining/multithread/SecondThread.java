package com.kprit.tns.backendtraining.multithread;

public class SecondThread extends Thread{
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
