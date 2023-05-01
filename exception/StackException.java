package com.exception;
import java.lang.*;
public class StackException {
	private int idx=0;
	private int[] arr;
	StackException(){
		arr=new int[10];
	}
	public void push(int x) {
		try {
			arr[idx]=x;
			idx++;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			
		}
	}
	public boolean isEmpty() {
		if(idx<=0) return true;
		return false;
	}
	
	public boolean isFull() {
		if(idx>=9)return true;
		return false;
	}
	public int peek() throws ArrayIndexOutOfBoundsException {
		if(isEmpty())
			throw new ArrayIndexOutOfBoundsException("Stack is full");
		return arr[idx-1];
	}
	public int pop() throws ArrayIndexOutOfBoundsException {
		
		if(isEmpty()) {
			throw new ArrayIndexOutOfBoundsException("stack is Empty");
				
		}
		return arr[--idx];
			
		
	}

}
