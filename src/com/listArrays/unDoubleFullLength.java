package com.listArrays;
//列出一个数组集合，这个数组包含重复元素，这时候我们只输出不重复的那些组成的长度，输出要求只输出这些数据的全排列
//方法，直接利用递归迭代，遍历所有可能出现的情况，然后检测那些长度=array.length的项目进行输出
import java.util.*;

public class unDoubleFullLength {
	static HashSet<Integer> hs = new HashSet<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1,2,3,4};
		List<Integer> list = Arrays.asList(array);
		listAll(list,"");
	}
	
	public static void listAll(List<Integer> ls, String prefix){
		if(prefix.length()==4){
			System.out.println(prefix);
		}
		
		for(int i=0;i<ls.size();i++){
			LinkedList<Integer> temp = new LinkedList<Integer>(ls);
			listAll(temp,prefix+temp.remove(i));
		}
	}
}