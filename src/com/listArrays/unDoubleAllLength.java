package com.listArrays;
//�г�һ�����鼯�ϣ��������û���ظ�Ԫ�أ�����ĳ����ǲ�Ϊ0�����ⳤ��
//������ֱ�����õݹ�������������п��ܳ��ֵ������Ȼ���������
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