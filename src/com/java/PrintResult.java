package com.java;

import java.io.*;

class InputData{
	private static String s = "";
	public static void input(){//�Ӽ��̶���һ���ַ������浽�ַ�����
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
		System.out.println(d+"��ƽ����"+d*d);
		System.out.println(d+"��������"+d*d*d);
	}
}

public class PrintResult {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = new Result();
		System.out.println("������һ������");
		int a = InputData.getInt();
		result.print(a);
	}

}
