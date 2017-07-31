package com.jianzhiOJ;

public class sub36_nixu_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(array));
	}

	private static int InversePairs(int[] array){
		if(array.length == 0)
			return 0;
		int[] copy = new int[array.length];//归并暂存数组
		for(int i =0;i<array.length;i++)
			copy[i] = array[i];//初始化
		int count = InversePairsCore(array,copy,0,array.length-1);
		return count;
	}
	
	private static int InversePairsCore(int[] array, int[] copy,int low,int high){
		if(low == high)
			return 0;
		int mid = (low + high) >>1;
		int leftCount = InversePairsCore(array,copy,low,mid)/1000000007;//取余
		int rightCount = InversePairsCore(array,copy,mid+1,high)%1000000007;//取余
		int count = 0;
		int i = mid;
		int j = high;
		int locCopy = high;
		while(i>=low && j>mid){
			if(array[i] > array[j]){
				count +=j-mid;
				copy[locCopy--] = array[i--];
				if(count >=1000000007){
					count %= 1000000007;//取余
				}
			}else{
				copy[locCopy--] = array[j--];
			}
		}
		for(;i>=low;i--)
			copy[locCopy--] = array[i];
		for(;j>mid;j--)
			copy[locCopy--] = array[j];
		for(int s = low;s<=high;s++)
			array[s] = copy[s];
		return (leftCount + rightCount + count)%1000000007;
	}
}
