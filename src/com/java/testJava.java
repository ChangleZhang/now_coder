package com.java;

import java.util.Stack;

public class testJava{
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
	public static void main(String[] args) {
		
	}
	public void push(int node) {
        stack1.push(node);
    }
    
    public void pop() {
    	while(stack1.isEmpty()){
    		;
    	}
    }
}

