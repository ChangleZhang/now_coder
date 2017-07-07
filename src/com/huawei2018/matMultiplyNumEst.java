package com.huawei2018;
import java.util.Stack;

public class matMultiplyNumEst {
	//矩阵乘法的运算量估计分析
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int[][] num = new int[][]{{61,4},{4,43},{43,52},{52,24},{24,29},{29,37},{37,23},{23,16}};
		String rule = "(A(B(C(D(E(F(GH))))))))";
		int calNum = cal(num,rule);
		System.out.println(calNum);
	}
	
	public static int cal(int[][] num,String rule){
		int res = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<rule.length();i++){
			if(rule.charAt(i)=='('){
				continue;
			}else if(rule.charAt(i)!=')'){
				int linenum = rule.charAt(i)-'A';
				stack.push(num[linenum][0]);
				stack.push(num[linenum][1]);
			}else{
				if(stack.size()!=2){
					int col2 = stack.pop();
					int row2 = stack.pop();
					int col1 = stack.pop();
					int row1 = stack.pop();
					res+=row1*col1*col2;
					stack.push(row1);
					stack.push(col2);
				}
			}
		}
		while(stack.size()!=2){
			int col2 = stack.pop();
			int row2 = stack.pop();
			int col1 = stack.pop();
			int row1 = stack.pop();
			res+=row1*col1*col2;
			stack.push(row1);
			stack.push(col2);
		}
		return res;
	}
}
