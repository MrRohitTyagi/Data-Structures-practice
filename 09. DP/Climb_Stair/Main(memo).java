import java.io.*;
import java.util.*;

public class Main {

    public static int stairPath(int n ,int[] dp){
        if(n==0){
            return 1;
        }
        if(dp[n] != 0 ){
            return dp[n];                            
        }
        int count = 0;
        if(n-1 >=0){
            count+=stairPath(n-1,dp);
        }
        if(n-2 >=0){
            count+=stairPath(n-2,dp);
        }
        if(n-3 >=0){
           count+= stairPath(n-3,dp);
        }
        return dp[n] = count;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n  = scn.nextInt();
        int[] dp = new int[n+1];
        int ans = stairPath(n,dp);
        System.out.println(ans);
    }

}
