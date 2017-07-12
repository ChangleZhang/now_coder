package com.jianzhiOJ;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class sub10_count1_in_2bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Numof1(10));
	}
	
	public static int Numof1(int n){
		int count = 0;
		int flag = 1;
		while(flag!=0){
			if((n&flag)!=0)
				count++;
			flag=flag << 1;
		}
		return count;
	}
	
	public static int Numof1_1(int n){
		int count = 0;
		while(n!=0){
			count ++;
			n = (n&(n-1));
		}
		return count;
	}
}
