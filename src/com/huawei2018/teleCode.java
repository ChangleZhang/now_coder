package com.huawei2018;
/*����籨���õ㣨.����ʾ1�����л��ߣ�-����ʾ0�������л��ߵ����У�
 * �ܹ������һ���������������Կ����޷���������
 * ���˶�����ת��Ϊ������ͨ��һ��ӳ������Խ�����ӳ���һ��Ӣ����ĸ��
 * ����㡢�л������м䣬��#���������������#�ţ�����һ��#�ţ�����ʾ���Ӣ����ĸ��
���籨��û�е㡢�л��ߣ�ֻ��#ʱ���籨����Ϊ���ַ�����
ÿ���㡢�л������У����Կ������޷�������
����е㡢�л������еĶ�����ֵ��������ӳ���ķ�Χ���������ERROR����
ӳ���
 */

public class teleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teleCode = ".-#-.###---.#.-.-#";
		
		//��ʼ�����ұ�
		String table = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza";
		char[] lookup = new char[52];
		for(int i=0;i<52;i++){
			lookup[i] = table.charAt(i);
		}
		
		String[] str = teleCode.split("#");
		String res = "";
		for(int i=0;i<str.length;i++){
			if(str[i].length()!=0){
				int ind = toInt(str[i]);
				if(ind<52){
					res+=String.valueOf(lookup[ind]);
				}else{
					res+="ERROR";
				}
			}
		}
		System.out.println(res);
	}
	
	public static int toInt(String str){
		int res = 0;
		for(int i=str.length()-1; i>=0; i--){
			if(str.charAt(i)=='.'){
				res+=Math.pow(2, str.length()-1-i);
			}
		}
		return res;
	}
}
