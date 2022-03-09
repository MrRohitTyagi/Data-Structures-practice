
import java.io.*;
import java.util.*;

public class Main {
    public static int tiling(int N, int [] dp){

        for(int n = 0 ; n <dp.length;n++){
        if(n<=1){
           dp[n] =  1;
           continue;
        }
        

        int horr =dp[n-1];// tiling(n-2,dp);
        int vert = dp[n-2];// tiling(n-1,dp);
        int myans = horr +vert;
        dp[n] = myans;
        }
        return dp[N];
    }

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
     int [] dp = new int[n+1];
    int ans = tiling(n,dp);
    System.out.println(ans);
    }
}