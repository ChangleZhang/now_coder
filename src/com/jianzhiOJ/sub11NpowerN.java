package com.jianzhiOJ;

public class sub11NpowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.0;
		int b = 2;
		System.out.println(Power(a,b));
	}

	public static double Power(double base, int exponent) {
		double res = 0.0;
		//判断底数为0的情况
		if(isZero(base, 0.0) && exponent <=0){
			return 0.0;
		}
		int unsignExp = 0;
		if(exponent < 0)
			unsignExp = -exponent;
		else
			unsignExp = exponent;
		res = powerwithunsign(base,unsignExp);
		if(exponent<0)
			res=1.0/res;
		return res;
	}
	
	public static boolean isZero(double a, double b){
		if(a - b > -0.000001 && a - b < 0.000001){
			return true;
		}else
			return false;
	}
	
	public static double powerwithunsign(double base, int n){
		if(n == 0)
			return 1;
		if(n == 1)
			return base;
		
		double result = powerwithunsign(base,n >> 1);
		result *= result;
		if((n & 0x1) ==1)
			result *=base;
		return result;
	}
}
