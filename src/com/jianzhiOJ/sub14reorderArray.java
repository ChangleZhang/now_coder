package com.jianzhiOJ;

import java.util.LinkedList;

public class sub14reorderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,5};
		reorderArray(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	/*
	 * ��λ�û��ķ�����ʱ�临�Ӷ���O(n^2)
	 */
	private static void reorderArray(int[] a){
		if(a==null || a.length ==0)
			return;
		int i=0;
		int j=0;
		while(i<a.length){
			while(i<a.length && !isEven(a[i]))
				i++;
			j = i+1;
			while(j<a.length && isEven(a[j]))
				j++;
			if(j<a.length){
				int tmp = a[j];
				for (int j2 = j-1; j2 >=i; j2--) {
					a[j2+1] = a[j2];
				}
				a[i++] = tmp;
			}else{
				break;
			}
		}
	}
	
	/*
	 * �������ռ�ķ�����ʱ�临�Ӷ�ΪO(n)���ÿռ任ʱ��
	 */
	private static void reorderArray2(int[] a){
		LinkedList<Integer> ltOdd = new LinkedList<Integer>();
		LinkedList<Integer> ltEven = new LinkedList<Integer>();
		for(int i=0;i<a.length;i++){
			if(isEven(a[i]))
				ltEven.add(a[i]);
			else
				ltOdd.add(a[i]);
		}
		int cnt = 0;
		while(!ltOdd.isEmpty()){
			a[cnt] = ltOdd.removeFirst();
			cnt++;
		}
		while(!ltEven.isEmpty()){
			a[cnt] = ltEven.removeFirst();
			cnt++;
		}
	}
	/*
	 * �ж��Ƿ��ǻ����ĺ�����������λ����
	 */
	private static boolean isEven(int n){
		if((n & 1)==1)
			return true;
		else
			return false;
	}
}
