package com.HuaWei2018_SZ;

import java.util.Stack;

public class kuohaopeidui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(1+2)/(0.5+1)";
		System.out.println(check(str));
	}


	public static boolean check(String str){
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
				st.push(str.charAt(i));
			if(str.charAt(i)==')'){
				if(st.pop()!='(')
					return false;
			}
			if(str.charAt(i)==']'){
				if(st.pop()!='[')
					return false;
			}
			if(str.charAt(i)=='}'){
				if(st.pop()!='{')
					return false;
			}
		}
		return true;
	}
}