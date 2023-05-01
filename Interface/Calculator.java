package com.Interface;

public class Calculator implements Calculation {
	public void add(int a, int b) {
		System.out.println("Add : "+(a+b));
	}
	public void substract(int a,int b) {
		System.out.println("substract : "+(a-b));
	}

}
