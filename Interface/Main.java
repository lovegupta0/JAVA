package com.Interface;

public class Main {

	public static void main(String[] args) {
		Calculator cal =new Calculator();
		cal.say();
		cal.add(5, 60);
		cal.substract(90, 50);
		System.out.println("------***********------");
		AbstractExtend absE=new AbstractExtend();
		absE.sayHi();
		absE.sayHello();

	}

}
