package com.kprit.tns.backendtraining.exceptiondemo;
//Custom Exception
public class InsufficientBalException extends Exception{
	
	InsufficientBalException(String message){
		
		super(message);
		
	}
}
