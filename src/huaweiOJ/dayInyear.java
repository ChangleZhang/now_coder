package huaweiOJ;

public class dayInyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1982;
		int mon = 3;
		int day = 4;
		int[] run = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		int[] ping = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int num =0;;
		if(year%4!=0){
			System.out.println("Æ½Äê");
			if(mon>12){
				System.out.println(-1);
			}else{
				if(day>ping[mon-1])
					System.out.println(-1);
				else{
					for(int i=0;i<mon-1;i++){
						num+=ping[i];
					}
					num+=day;
					System.out.println(num);
				}
			}
		}else{
			System.out.println("ÈòÄê");
			if(mon>12){
				System.out.println(-1);
			}else{
				if(day>run[mon-1])
					System.out.println(-1);
				else{
					for(int i=0;i<mon-1;i++){
						num+=run[i];
					}
					num+=day;
					System.out.println(num);
				}
			}
		}
	}

}
