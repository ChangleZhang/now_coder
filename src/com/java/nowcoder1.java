package com.java;

import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Pattern;

public class nowcoder1 {
		static int res = 0;
	 	static int cut(int[] parts) {
	 		if(parts.length<2)
	 			return 0;
	 		if(parts.length==2 && parts[1]!=0)
	 			return sum(parts);
	 		if(parts.length==2 && parts[1]==0)
	 			return 0;
	 		Arrays.sort(parts);
	 		int[] left = new int[parts.length/2+1];
	 		int[] right = new int[parts.length/2+1];
	 		int beginpos = 0;
	 		int endpos = parts.length-1;
	 		int leftpos = 0;
	 		int rightpos = 0;
	 		while(beginpos<=endpos){
	 			if(beginpos==endpos){
	 				if(sum(left)<sum(right)){
	 					left[leftpos++] = parts[beginpos];
	 					break;
	 				}else{
	 					right[rightpos++] = parts[beginpos];
	 					break;
	 				}
	 			}
	 			if(sum(left)<sum(right) && leftpos!=left.length){
	 				left[leftpos++] = parts[beginpos++];
	 				left[leftpos++] = parts[endpos--];
	 			}else{
	 				right[rightpos++] = parts[beginpos++];
	 				right[rightpos++] = parts[endpos--];
	 			}
	 		}
	 		System.out.println(sum(parts));
	 		return sum(parts)+cut(left)+cut(right);
	    }
	 	
	 	private static int sum(int[] array){
	 		int n = 0;
	 		for(int i=0;i<array.length;i++)
	 			n+=array[i];
	 		return n;
	 	}
	    public static void main(String[] args){
	        int pieces = 4;
	        int[] parts = new int[]{6,7,8,10,12};
	        System.out.println(cut(parts));
	        System.out.println(getMaxDiff(parts));
	    }
	    
	    public static int getMaxDiff(int[] array) {  
	        int sum = sum(array);  
	        int length = array.length;  
	        int[][] f = new int[length + 1][sum / 2 + 1];  
	        for (int i = 0; i < length; i++) {  
	            for (int j = 1; j <= sum / 2; j++) {  
	                f[i + 1][j] = f[i][j];  
	                if (array[i] <= j && f[i][j - array[i]] + array[i] > f[i][j]) {  
	                    f[i + 1][j] = f[i][j - array[i]] + array[i];  
	                }  
	            }  
	        }
	        for(int i=0;i<f.length;i++){
	        	for(int j=0;j<f[0].length;j++){
	        		System.out.print(f[i][j]+" ");
	        	}
	        	System.out.println("");
	        }
	        return f[length][sum / 2];  
	    }
}
