package com.jianzhiOJ;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class sub55MaxValInHuaDongWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{2,3,4,2,6,2,5,1,4};
		System.out.println(maxInWindows(test,4).toString());
	}

	public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(size == 0) return res;
        int begin;  
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < num.length; i++){
            begin = i - size + 1;
            if(q.isEmpty())
                q.add(i);
            else if(begin > q.peekFirst())
                q.pollFirst();
         
            while((!q.isEmpty()) && num[q.peekLast()] <= num[i])
                q.pollLast();
            q.add(i);
            System.out.println(q.toString());
            if(begin >= 0)
                res.add(num[q.peekFirst()]);
        }
        return res;
    }
}
