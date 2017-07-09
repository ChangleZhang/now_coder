package com.java;

public class testJava {

	
	   public static void main(String args[]){
		   int N =6;
		   int m = getOne(N);
		   System.out.println(m);
	   }
	   public static int getOne(int N){
		   String buf = "";
		   while(N>0){
			   buf=N%2+buf;
			   N/=2;
		   }
		   int max = 0;
		   String pattern = "1";
		   if(buf.contains(pattern))
			   max=1;
		   for(int i=0;i<buf.length();i++){
			   if(buf.contains(pattern)){
				   max = pattern.length();
			   }
			   pattern +="1";
		   }
		   return max;
	   }
	   
}

