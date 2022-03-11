import java.io.*;
	import java.util.*;

	public class Main {
		 public static int UnboundedKS(int [] val,int [] wt,int cap,int [] dp,int n){
			 
			 for(int bag =1;bag<dp.length;bag++){
				 int maxProfit =0;
				 for(int i= 0 ;i<n;i++){
					 if(bag - wt[i]>= 0){
						 int pv = bag - wt[i];
						 int prevmaxval = dp[pv];
						 int myans = prevmaxval+val[i];

						maxProfit = Math.max(myans,maxProfit);

					 }
					 dp[bag]=maxProfit;
				 }
			 }
			 return dp[cap];
		 }
		

	    public static void main(String[] args) throws Exception {
			Scanner scn = new Scanner (System.in);
			int n = scn.nextInt();
			int [] val = new int [n]; 
			for( int i =0 ;i<n  ;i++  ) {
				val[i] = scn.nextInt();
			}

			int [] wt = new int [n];

			for( int i =0 ;i<n  ;i++  ) {
				wt[i] = scn.nextInt();
			}
			int cap = scn.nextInt();
			int [] dp = new int[cap+1];

			int ans = UnboundedKS(val,wt,cap,dp,n);
			System.out.println(ans);

	    }
	}