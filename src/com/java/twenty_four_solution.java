package com.java;

public class twenty_four_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[]{1,2,7,10};
		double result = 0;
		int[] temp = new int[4];
		System.out.println(check(num,temp,result));
	}
	
	public static boolean check(int[] num,int[] temp,double result){
		for(int i=0;i<num.length;i++){
			if(temp[i]==0){
				temp[i]=1;
				if(check(num,temp,result+num[i])||check(num,temp,result-num[i])||check(num,temp,result*num[i])||check(num,temp,result/num[i])){
					return true;
				}
				temp[i]=0;
			}
		}
		if(result==24)
			return true;
		else
			return false;
	}
}
