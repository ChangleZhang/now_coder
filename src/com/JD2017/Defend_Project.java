package com.JD2017;

public class Defend_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hill = new int[]{4972,4972,4972,4858,4858,4972,4972,4972,4858,4972};
		System.out.println(getCount(hill));
	}
	
	private static int getCount(int[] arr){
		if(arr==null || arr.length<2)
			return 0;
		else{
			int res = 0;
			int[][] dp = getDP(arr);
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					res+=dp[i][j];
				}
			}
			return res/2;
		}
	}
	
	private static int[][] getDP(int[] arr){
		int[][] dp = new int[arr.length][arr.length];
		dp[0][arr.length-1] = 1;
		dp[arr.length-1][0] = 1;
		for(int i =0;i<dp.length;i++){
			for(int j=0 ; j<dp.length;j++){
				if(i==j)
					dp[i][j] = 0;
				else if (i==j-1 || j== i-1)
					dp[i][j] =1;
				else{
					if((j>0 && dp[i][j-1]==1 && arr[j-1]<=Math.min(arr[i],arr[j]))||(j>0 && dp[i][j-1]==1 && arr[j-1]==Math.max(arr[i],arr[j])))
						dp[i][j]=1;
					if((i>0 && dp[i-1][j]==1 && arr[i-1]<=Math.min(arr[i], arr[j]))||(i>0 && dp[i-1][j]==1 && arr[i-1]==Math.max(arr[i], arr[j])))
						dp[i][j]=1;
				}
			}
		}
		for(int i =0;i<dp.length;i++){
			for(int j=0;j<dp.length;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
			
		return dp;
	}
}
