package com.listArrays;
//�г�һ�����鼯�ϣ������������ظ�Ԫ�أ���ʱ������ֻ������ظ�����Щ��ɵĳ��ȣ�����ĳ����ǲ�Ϊ0�����ⳤ��
//������ֱ�����õݹ�������������п��ܳ��ֵ������Ȼ�����������������һ��HashSetȫ�ֱ�������ȥ�ظ����
import java.util.*;

public class DoubleAllLength {
	static HashSet<Integer> hs = new HashSet<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = {1,1,2,2};
		List<Integer> list = Arrays.asList(array);
		listAll(list,"");
	}
	
	public static void listAll(List<Integer> ls, String prefix){
		if(prefix.length()!=0){
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