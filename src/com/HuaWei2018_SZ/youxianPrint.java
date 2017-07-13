package com.HuaWei2018_SZ;

import java.util.Arrays;

public class youxianPrint {
	static int last = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "9";
		int cnt = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='1' && str.charAt(i)<='9'){
				cnt++;
			}
		}
		int[] mat = new int[cnt];
		int[] count = new int[10];
		int flag = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='1' && str.charAt(i)<='9'){
				int num = Integer.parseInt(String.valueOf(str.charAt(i)));
				mat[flag] = num;
				count[num]++;
				flag++;
			}
		}
		
		StringBuffer res = new StringBuffer();
		int pos = 0;
		for(int i=9;i>0;i--){
			while(count[i]!=0){
				int chPos = pos%cnt;
				if(mat[chPos]==i){
					res.append(chPos+", ");
					count[i]--;
				}
				pos++;
			}
		}
		if(res.length()==0){
			System.out.println("");
		}else{
			System.out.println(res.substring(0,res.length()-2));
		}
		
	}
}
