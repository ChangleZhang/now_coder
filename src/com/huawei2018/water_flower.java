package com.huawei2018;

public class water_flower {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		for(int i=100;i<1000;i++){
			if(isShuiXian(i)){
				res+=i;
			}
		}
		System.out.println(res);
	}
	public static boolean isShuiXian(int i){
			int bai = i/100;
			int shi = (i%100)/10;
			int ge = (i%100)%10;
			if((bai*bai*bai+shi*shi*shi+ge*ge*ge)==i)
				return true;
			else
				return false;
	}
}