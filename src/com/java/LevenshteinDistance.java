package com.java;

public class LevenshteinDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "jary";
		String str2 = "jerry";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		System.out.println(Ldistance(ch1,ch2));
	}
	public static int Ldistance(char[] ch1,char[] ch2){
		int m = ch1.length;
		int n = ch2.length;
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<m+1;i++){
			dp[i][0]=i;
		}
		for(int j=0;j<n+1;j++){
			dp[0][j]=j;
		}
		for(int i = 1 ; i < ch1.length + 1 ; i++){ 
			for(int j = 1 ; j < ch2.length + 1 ; j++){ 
			if(ch1[i-1] == ch2[j-1])//如果i,j位相同，则不用变化，与上一轮结果是一样的
				dp[i][j] = dp[i-1][j-1]; 
			else{//如果i,j位不同，那么就需要从给ch1增加一个字母，给ch2增加一个字母或者把ch1一个字母变成和ch2一样来选一个最小的作为这个点的改变距离
				dp[i][j] = Math.min(Math.min(dp[i-1][j] + 1 ,dp[i][j-1] + 1) , dp[i-1][j-1] + 1); 
				} 
			} 
		} 
		return dp[m][n];
	}
}
