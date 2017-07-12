package com.MeiTuan2017;

import java.util.Arrays;

public class moneyCharge {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 13;
		long res = count(N);  
        System.out.println(res);  
	}
	
	public static long count(int n) {  
        int coins[] = { 1, 5, 10, 20, 50, 100 };  
        int h = coins.length;  
        long dp[][] = new long[h][n + 1];  
        Arrays.fill(dp[0], 1);  
  
        for (int i = 1; i < h; i++) {  
            for (int j = 1; j <= n; j++) {  
                int m = j / coins[i];  
                for (int k = 0; k <= m; k++) {  
                    dp[i][j] = dp[i][j] + dp[i - 1][j - k * coins[i]];  
                }  
            }  
        }  
        return dp[h - 1][n];  
    } 
}
