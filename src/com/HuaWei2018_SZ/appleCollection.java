package com.HuaWei2018_SZ;

public class appleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M=2;
		int N=4;
		int[][] arr = new int[][]{{1,2,3,40},{6,7,8,90}};
		int[][] dp = new int[M][N];
		dp[0][0] = arr[0][0];
		for(int i=1;i<N;i++){
			dp[0][i]=arr[0][i]+dp[0][i-1];
		}
		for(int i=1;i<M;i++){
			dp[i][0]=arr[i][0]+dp[i-1][0];
		}
		for(int i=1;i<M;i++){
			for(int j=1;j<N;j++){
				dp[i][j] = Math.max(dp[i-1][j]+arr[i][j],dp[i][j-1]+arr[i][j]);
			}
		}
		System.out.println(dp[M-1][N-1]);
	}

}
