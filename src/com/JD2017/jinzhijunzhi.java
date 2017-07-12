package com.JD2017;

public class jinzhijunzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int bit = 0;
		for(int i=2;i<n;i++){
			bit+=CNT(i,n);
		}
		int mu = n-2;
		int maxDef = Def(bit,mu);
		if(maxDef!=1){
			bit=bit/maxDef;
			mu=mu/maxDef;
		}
		System.out.println(bit+"/"+mu);
	}
	
	public static int CNT(int i,int n){
		int res = 0;
		while(n>0){
			res+=n%i;
			n/=i;
		}
		return res;
	}
	public static int Def(int n,int m){
		int def = 1;
		for(int i=2;i<=m;i++){
			if(n%i==0 && m%i==0)
				def = i;
		}
		return def;
	}
}
