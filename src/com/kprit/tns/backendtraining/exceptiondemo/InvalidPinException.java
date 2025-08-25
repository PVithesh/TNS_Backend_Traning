package com.kprit.tns.backendtraining.exceptiondemo;
//Custom Exception
public class InvalidPinException extends Exception{
	
	InvalidPinException(String msg){
		super(msg);
	}

}
