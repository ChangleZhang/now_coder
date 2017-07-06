package com.java;

import java.io.*;

class InputData{
	private static String s = "";
	public static void input(){//从键盘读入一个字符并保存到字符串中
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		try{
			s = bu.readLine();
		}catch(IOException ioe){
			//do nothing
		}
	}
	
	public static int getInt(){
		input();
		return Integer.parseInt(s);
	}
}

class Result{
	void print(int d){
		System.out.println(d+"的平方是"+d*d);
		System.out.println(d+"的立方是"+d*d*d);
	}
}

public class PrintResult {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = new Result();
		System.out.println("请输入一个整数");
		int a = InputData.getInt();
		result.print(a);
	}

}
