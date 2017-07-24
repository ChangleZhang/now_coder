package com.jianzhiOJ;

public class Sub29_Words_MoreThan_Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test_array = new int[]{5,2,3,7,7,7,7};
		System.out.println(MoreThanHalfNum_Solution(test_array));
	}

	public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)
        	return 0;
        /*
         * 解法1，调用快速排序中的Partition方法，会改变输入数组，时间复杂度O(n)
         */
//        int len = array.length;
//        int mid = len >>1;
//        int start = 0;
//        int end = len-1;
//        int index = Partition(array,start,end);
//        while(index!=mid){
//        	if(index>mid){
//        		end = index-1;
//        		index = Partition(array,start,end);
//        	}else{
//        		start = index+1;
//        		index = Partition(array,start,end);
//        	}
//        }
//        int result = array[index];
//        if(check(array,result))
//        	return result;
//        else
//        	return 0;
        /*
         * 解法2 利用数组特性
         */
        int result = array[0];
        int times = 1;
        for(int i =1;i<array.length;i++){
        	if(times == 0){
        		result = array[i];
        		times = 1;
        	}
        	else if(array[i]==result){
        		times++;
        	}else{
        		times--;
        	}
        }
        if(check(array,result))
        	return result;
        else
        	return 0;
    }
	
	private static boolean check(int[] array,int a){
		int cnt = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]==a)
				cnt++;
		}
		if(2*cnt<=array.length)
			return false;
		else
			return true;
	}
	
	public static int Partition(int[] data, int start, int end) {
		int pivotIndex = start;
	    int pivot = data[pivotIndex];
	    swap(data, pivotIndex, end);
	 
	    int low = start;
	    int high = end;
	 
	    while (low < high) {
	        // 因为把pivot放在了最后，所以low指针先走
	        while (low < high && data[low] <= pivot) low++; 
	        while (low < high && data[high] >= pivot) high--;
	        if(low < high) swap(data, low, high);
	    }
	    swap(data, low, end);
	    return low;
    }

	/**
	 * 利用了原位交换的方法交换数组中i,j的值，这种方法不需要借助辅助空间就能够实现交换
	 * @param data
	 * @param i
	 * @param j
	 */
	public static void swap(int[] data, int i, int j) {
        if (i == j) {
            return;
        }
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }

}
