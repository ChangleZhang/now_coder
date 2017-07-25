package com.jianzhiOJ;

public class Sub31_MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,5,-1,-2,4,-8,100};
		System.out.println(FindGreatestSumOfSubArray(arr));
	}

	public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0)
        	return 0;
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for(int i=1;i<array.length;i++){
        	if(dp[i-1]<0)
        		dp[i] = array[i];
        	else
        		dp[i] = dp[i-1]+array[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
        	if(dp[i]>max)
        		max = dp[i];
        }
        return max;
    }
}
