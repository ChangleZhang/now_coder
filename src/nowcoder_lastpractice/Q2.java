package nowcoder_lastpractice;
/*
 * 判断最少卡片构成的回文个数，这个问题我认为直接求最少奇数元素个数即可
 */
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(oddin(str));
	}

	private static int oddin(String str){
		int[] arr = new int [256];
		for(int i=0;i<str.length();i++){
			int num = str.charAt(i);
			arr[num]++;
		}
		int res = 0;
		for(int i = 0;i<256;i++){
			if((arr[i] & 0X1) == 1)
				res++;
		}
		return res;
	}
}
