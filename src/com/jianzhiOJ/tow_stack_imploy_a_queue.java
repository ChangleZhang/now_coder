package com.jianzhiOJ;

import java.util.Stack;

public class tow_stack_imploy_a_queue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tow_stack_imploy_a_queue a = new tow_stack_imploy_a_queue();
		a.push(1);
		a.push(2);
		a.push(3);
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
	}

	public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	int res = stack2.pop();
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return res;
    }
}
