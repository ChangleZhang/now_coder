package com.jianzhiOJ;

public class sub43_prop_of_n_touzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 6;
		int max = 6;
		int[][] dp = new int[N][max*N];
		for(int i=0;i<max;i++){
			dp[0][i]=1;
			System.out.print(dp[0][i]+" ");
		}
		System.out.println("");
		for(int i=1;i<N;i++){//±éÀúÐÐ
			for(int j=0;j<max*N;j++){
				if(j<6){
					int sum = 0;
					for(int k=0;k<j;k++){
						sum+=dp[i-1][k];
					}
					dp[i][j] = sum;
				}else{
					dp[i][j] = dp[i-1][j-1]+dp[i-1][j-2]+dp[i-1][j-3]+dp[i-1][j-4]+dp[i-1][j-5]+dp[i-1][j-6];
				}
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
