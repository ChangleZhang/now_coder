package nowcoder_lastpractice;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32;
		System.out.println(f(n));
	}

	private static long f(int n){
		int mod = 1000000007;
		int[] vis = new int[n+1];
		long ans = 1;
		for(int i=2;i<=n;i++){
			if(vis[i]==1)
				continue;
			for(int j=i+i;j<=n;j+=i) vis[j]=1;
			int tmp = n;
			int cnt = 0;
			while(tmp>=i){
				tmp/=i;
				cnt++;
			}
			ans = ans*(cnt+1)%mod;
		}
		return ans;
	}
}
