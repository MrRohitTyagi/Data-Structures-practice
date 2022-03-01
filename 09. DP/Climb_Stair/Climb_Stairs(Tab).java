import java.io.*;
import java.util.*;

public class Main {

    

    public static int stairPathtab(int N,int[] dp){

        for( int n = 0;n<dp.length;n++){


        if(n==0){
            dp[n]= 1;
            continue;
        }
                                    
        
        int count = 0;
        if(n-1 >=0){
            count+=dp[n-1];
        }
        if(n-2 >=0){
            count+=dp[n-2];
        }
        if(n-3 >=0){
           count+= dp[n-3];
        }
        dp[n] = count;
    }
    return dp[N];

        }
        

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n  = scn.nextInt();
        int[] dp = new int[n+1];
        int ans = stairPathtab(n,dp);
        System.out.println(ans);
    }

}
