package com.kprit.tns.backendtraining.multithread;

public class MainThread {

	public static void main(String[] args) {
		ThreadClass ob = new ThreadClass();
		ob.start();
		SecondThread obj = new SecondThread();
		obj.start();
	}

}
