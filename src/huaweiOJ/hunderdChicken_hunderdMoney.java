package huaweiOJ;

import java.util.ArrayList;

public class hunderdChicken_hunderdMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> res = new ArrayList<int[]>();
		for(int i=0;i<20;i++){
			for(int j=0;j<34;j++){
				for(int k=0;k<300;k+=3){
					if((5*i+3*j+k/3==100)&&((i+j+k)==100)){
						int[] app = new int[]{i,j,k};
						res.add(app);
					}
				}
			}
		}
		for(int[] obj:res){
			System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
		}
	}

}
