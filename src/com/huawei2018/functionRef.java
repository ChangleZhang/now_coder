package com.huawei2018;
/*�ж��Ƿ���к������ù�ϵ
 * 
 * ���� 3 //������ϵ����
 *  A B //A ֱ�ӵ���B
 *  B C
 *  C A
 *  A B //�ж�A��B ֮���Ƿ��е��ù�ϵ��A����B��
 *  ע����A����B��B����C����A��ӵ���C��A��C֮���е��ù�ϵ
 * */
import java.io.*;

public class functionRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ref = new int[26][26];
		String s ="";
		String[] s1 = {"A B","B C","A F","F F","F A","F R"};
		int n =s1.length;
		//��������
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
		//��������
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
