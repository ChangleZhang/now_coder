package com.huawei2018;
/*判断是否具有函数调用关系
 * 
 * 输入 3 //函数关系个数
 *  A B //A 直接调用B
 *  B C
 *  C A
 *  A B //判断A与B 之间是否有调用关系（A调用B）
 *  注：若A调用B，B调用C，则A间接调用C，A与C之间有调用关系
 * */
import java.io.*;

public class functionRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ref = new int[26][26];
		String s ="";
		String[] s1 = {"A B","B C","A F","F F","F A","F R"};
		int n =s1.length;
		//读入数据
		for(int i=0;i<n;i++){
			//System.out.println("please input reference relation of "+i+" :");
			//BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
			//try{
				//s = bu.readLine();
				String[] a = s1[i].split(" ");
				if(a[0].charAt(0)-'A'!=a[1].charAt(0)-'A'){
				ref[a[0].charAt(0)-'A'][a[1].charAt(0)-'A']=1;
				}
			//}catch(IOException ioe){
				//do nothing
			//}
		}
		//读入需求
		System.out.println("please input relation your wanna know:");
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		try{
			s = bu.readLine();
			String[] a = s.split(" ");
			int i = a[0].charAt(0)-'A';
			int j = a[1].charAt(0)-'A';
			check(ref,i,i,j);
			if(ref[i][j]==1){
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}catch(IOException ioe){
			//do nothing
		}
	}
	
	public static void check(int[][] ref,int line,int i,int j){
		if(ref[i][i]==0){
			ref[i][i]=1;
			System.out.println(i+" Marked");
			for(int k=0;k<26;k++){
				if(ref[i][k]==1 && k!=i){
					if(k==j){
						ref[line][j]=1;
						return;
					}
					else{
						check(ref,line,k,j);
					}
				}
			}
		}
	}
}
