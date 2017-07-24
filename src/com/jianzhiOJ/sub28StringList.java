package com.jianzhiOJ;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符
 * 串abc,acb,bac,bca,cab和cba。
 * 可能会有重复，需要进行去重检测
 */
public class sub28StringList {
	
	static int n = 0;
	static HashSet<String> hs = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a";
		n = str.length();
		ArrayList<String> res = Permutation(str);
		for(String s:res){
			System.out.println(s);
		}
	}

	public static ArrayList<String> Permutation(String str) {
	       ArrayList<Character> ch = new ArrayList<Character>();
	       for(int i=0;i<str.length();i++){
	    	   ch.add(str.charAt(i));
	       }
	       ArrayList<String> res = new ArrayList<String>();
	       listAll(res,ch,"");
	       return res;
    }
	
	public static void listAll(ArrayList<String> res,ArrayList<Character> ch,String prefix){
		if(prefix.length()==n && !hs.contains(prefix)){
			hs.add(prefix);
			res.add(prefix);
		}else{
			for(int i=0;i<ch.size();i++){
				ArrayList<Character> tmp = new ArrayList<Character>(ch);
				String add = String.valueOf(tmp.remove(i));
				listAll(res,tmp,prefix+add);
			}
		}
	}
}
