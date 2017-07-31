package com.jianzhiOJ;

public class sub38_num_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,3,3,3,4,5};
		System.out.println(GetNumberOfK(array,6));
	}

	public static int GetNumberOfK(int [] array , int k) {
	       int number = 0;
	       if(array.length == 0)
	    	   return 0;
	       int fk = getFirstk(array,k,0,array.length);
	       int lk = getLastk(array,k,0,array.length);
	       if(fk>-1 && lk>-1)
	    	   number = lk-fk+1;
	       return number;
    }
	
	private static int getFirstk(int[] array,int k,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)>>1;
		if(mid==array.length)
			return -1;
		int midData = array[mid];
		if(midData == k){
			if((mid >0 && array[mid-1]!=k)||mid==0 )
				return mid;
			else
				end = mid-1;
		}
		else if(midData>k)
			end = mid-1;
		else
			start = mid+1;
		return getFirstk(array,k,start,end);
	}
	
	private static int getLastk(int[] array,int k,int start,int end){
		if(start>end)
			return -1;
		int mid = (start+end)>>1;
		if(mid==array.length)
			return -1;
		int midData = array[mid];
		if(midData == k){
			if((mid <array.length-1 && array[mid+1]!=k)||mid==array.length-1 )
				return mid;
			else
				start = mid+1;
		}
		else if(midData<k)
			start = mid+1;
		else
			end = mid-1;
		return getLastk(array,k,start,end);
	}
}
