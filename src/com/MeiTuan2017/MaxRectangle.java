package com.MeiTuan2017;

public class MaxRectangle {
	static int maxS = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mat = new int[]{2,1,5,6,2,3};
		int begin = 0;
		int end = mat.length-1;
		cal(mat,begin,end);
		System.out.println(maxS);
	}

	private static void cal(int[] mat,int b,int e){
		if(b==e){
			if(mat[b]>maxS)
				maxS = mat[b];
			return;
		}else{
			int min = mat[b];
	        int minpos = b;
	        for(int i=0;i<mat.length;i++){
				if(mat[i]<min){
					min = mat[i];
					minpos = i;
				}
			}
	        if(min*(e-b+1)>maxS)
	        	maxS=min*(e-b+1);
	        cal(mat,b,minpos-1);
	        cal(mat,minpos+1,e);
		}
	}
}