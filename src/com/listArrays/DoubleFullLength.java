package com.listArrays;
//列出一个数组集合，这个数组包含重复元素，这时候我们只输出不重复的那些组成的长度，输出全排列的那些情况
//方法，直接利用递归迭代，遍历所有可能出现的情况，然后做出输出，并声明一个HashSet全局变量进行去重复检测
import java.util.*;

public class DoubleFullLength {
	static HashSet<Integer> hs = new HashSet<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1,2,3,4,4};
		List<Integer> list = Arrays.asList(array);
		listAll(list,"");
	}
	
	public static void listAll(List<Integer> ls, String prefix){
		if(prefix.length()==5){
			int i =Integer.parseInt(prefix);
			if(!hs.contains(i)){
				hs.add(i);
				System.out.println(prefix);
			}
		}
		
		for(int i=0;i<ls.size();i++){
			LinkedList<Integer> temp = new LinkedList<Integer>(ls);
			listAll(temp,prefix+temp.remove(i));
		}
	}
}