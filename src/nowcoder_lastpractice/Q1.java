package nowcoder_lastpractice;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ouLength("abaababaab"));
	}

	private static int ouLength(String s){
		if(s.length()==0)
			return 0;
		int res = 0;
		for(int i=2;i<=s.length()-1;i+=2){
			String tmp = s.substring(0, i);
			if(isOu(tmp))
				res = i;
		}
		return res;
	}
	
	private static boolean isOu(String s){
		int mid = s.length() >> 1;
		for(int i=0;i<mid;i++){
			if(s.charAt(i)!=s.charAt(mid+i))
				return false;
		}
		return true;
	}
}
