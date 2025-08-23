package com.kprit.tns.backendtraining.oopsdemo;
//Child Class
public class Student extends Person {
    int sid;
    String sbranch;

    // Parameterized Constructor
    public Student(String pname, long contactno, String address, int sid, String sbranch) {
        super(pname, contactno, address);
        this.sid = sid;
        this.sbranch = sbranch;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sbranch=" + sbranch+", pname=" + pname + ", contactno=" + contactno+ ", address=" + address + "]";
    }
}

		
		

