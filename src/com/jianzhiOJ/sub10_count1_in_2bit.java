package com.jianzhiOJ;
//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
