package com.Interface;

public interface Calculation {
	void add(int a,int b);
	void substract(int a, int b);
	default void say() {
		System.out.println("Its Interface");
	}

}
