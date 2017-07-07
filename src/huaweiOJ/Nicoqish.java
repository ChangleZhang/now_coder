package huaweiOJ;

public class Nicoqish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int max = (int)Math.pow(n, 3);
		int flag = 0;
		String res = "";
		for(int i=1;i<max && flag==0;i+=2){
			int sum = 0;
			int tmp = i;
			int cnt=0;
			while(sum<max && cnt<=n){
				sum+=tmp;
				tmp+=2;
				cnt++;
			}
			if(sum==max){
				flag=1;
				for(int j=i;j<tmp;j+=2){
					if(j!=tmp-2)
						res+=j+"+";
					else
						res+=j;
				}
			}
		}
		System.out.println(res);
	}

}
