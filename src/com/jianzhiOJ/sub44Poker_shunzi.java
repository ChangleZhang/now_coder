package com.jianzhiOJ;

public class sub44Poker_shunzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{1,0,3,0,5};
		System.out.println(isContinuous(numbers));
	}
	
	public static boolean isContinuous(int [] numbers) {
		if(numbers.length == 0)
            return false;
        int[] mat = new int[14];
        for(int i=0;i<numbers.length;i++){
            mat[numbers[i]]++;
        }
        
        for(int i=1;i<mat.length;i++){
            if(mat[i]>1)
                return false;
        }
        int z = mat[0];
        int flag = numbers.length-z;
        int cnt = 0;
        if(z==4)
            return true;
        else{
            for(int i=1;i<mat.length&&flag!=0;i++){
                if(mat[i]==1){
                    flag--;
                }else{
                    if(flag<numbers.length-z)
                        cnt++;
                }
            }
        }
        if(z>=cnt)
            return true;
        else
            return false;
    }

}
