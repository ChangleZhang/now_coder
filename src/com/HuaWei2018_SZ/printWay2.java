package com.HuaWei2018_SZ;

import java.util.ArrayList;

public class printWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		int[] count = new int[10];
        int[] mat = new int[list.size()];
        for(int i=0;i<list.size();i++){
            int tmp  = list.get(i);
            count[tmp]++;
            mat[i] = tmp;
        }
        int sz = list.size();
        
		StringBuffer res = new StringBuffer();
		int pos = 0;
		for(int i=9;i>0;i--){
			while(count[i]!=0){
				int chPos = pos%sz;
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
