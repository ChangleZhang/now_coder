package com.listArrays;
//�г�һ�����鼯�ϣ������������ظ�Ԫ�أ���ʱ������ֻ������ظ�����Щ��ɵĳ��ȣ����Ҫ��ֻ�����Щ���ݵ�ȫ����
//������ֱ�����õݹ�������������п��ܳ��ֵ������Ȼ������Щ����=array.length����Ŀ�������
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