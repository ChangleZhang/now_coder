package com.JD2017;

public class LuckyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =21;
		int cnt = 0;
		for(int i=1;i<=n;i++){
			if(Ten(i)==Bit(i))
				cnt++;
		}
		System.out.println(cnt);
	}
	
	private static int Ten(int i){
		int res = 0;
		while(i>0){
			res+=i%10;
			i/=10;
		}
		return res;
	}
	
	private static int Bit(int i){
		int res = 0;
		while(i>0){
			res+=i%2;
			i/=2;
		}
		return res;
	}
}
