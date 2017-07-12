package com.jianzhiOJ;

public class sub8_Min_in_sorted_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{2,2,2,3,3,3};
		sub8_Min_in_sorted_rotate_array t = new sub8_Min_in_sorted_rotate_array();
		System.out.println(t.minNumberInRotateArray(test));
	}
	
	public int minNumberInRotateArray(int [] array) {
    	if(array.length==0)
            return 0;
        int index1 = 0;
        int index2 = array.length - 1;
        int indexMid = index1;
        while(array[index1]>=array[index2]){
            if(index2-index1 == 1){
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2)/2;
            //如果下标index1,index2和indexMid三个数相等，就只能顺序查找了
            if(array[index1]==array[index2] && array[index1] == array[indexMid])
                return MinInOrder(array,index1,index2);
            if(array[indexMid] >= array[index1])
                index1 = indexMid;
            else if(array[indexMid]>=array[index2])
                index2 = indexMid;
        }
        return array[indexMid];
    }
    private int MinInOrder(int[] array,int index1,int index2){
        int result = array[index1];
        for(int i= index1+1;i<=index2;i++){
            if(array[i]<result)
                result = array[i];
        }
        return result;
    }
}
