package com.listArrays;
//列出一个数组集合，这个数组没有重复元素，输出的长度是不为0的任意长度
//方法，直接利用递归迭代，遍历所有可能出现的情况，然后做出输出
import java.util.*;

public class unDoubleAllLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1,2};
		List<Integer> list = Arrays.asList(array);
		listAll(list,"");
	}
	
	public static void listAll(List<Integer> ls, String prefix){
		if(prefix.length()!=0){
			System.out.println(prefix);
		}
		
		for(int i=0;i<ls.size();i++){
			LinkedList<Integer> temp = new LinkedList<Integer>(ls);
			listAll(temp,prefix+temp.remove(i));
		}
	}
}