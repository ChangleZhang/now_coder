package com.jianzhiOJ;
//查找斐波那契数列中的第n个元素
public class sub9_Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<38;i++){
			System.out.println(Fibonacci3(i));
		}
		
	}
	//递归法
	public static int Fibonacci1(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return Fibonacci1(n-1)+Fibonacci1(n-2);
	}
	//循环法
	public static int Fibonacci2(int n) {
        int cnt  =0;
        int val1 = 1;
        int val2 = 0;
        int tmp;
        while(cnt<n){
            val1 = val1+val2;
            tmp = val2;
            val2 = val1;
            val1 = tmp;
            cnt++;
        }
        return val2;
    }
	//动态规划版本
	public static int Fibonacci3(int n) {
        int f = 0;
        int g = 1;
        while(n-->0){
        	f+=g;
        	g = f - g;
        }
        return f;
    }
}
