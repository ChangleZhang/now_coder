package com.huawei2018;
/*假设电报中用点（.）表示1，用中划线（-）表示0，点与中划线的序列，
 * 能够翻译成一个二进制数（可以看做无符号数）。
 * 将此二进制转换为整数后，通过一个映射表，可以将整数映射成一个英文字母。
 * 多个点、中划线序列间，用#隔开（多个连续的#号，算作一个#号），表示多个英文字母。
当电报中没有点、中划线，只有#时，电报内容为空字符串。
每个点、中划线序列，可以看做是无符号数。
如果有点、中划线序列的二进制值超出如下映射表的范围，则输出”ERROR”。
映射表：
 */

public class teleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teleCode = ".-#-.###---.#.-.-#";
		
		//初始化查找表
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
