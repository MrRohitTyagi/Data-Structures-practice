import java.io.*;
import java.util.*;

public class Main {
    public static int tiling(int n, int [] dp){
        if(n<=1){
            return dp[n] =  1;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        int horr = tiling(n-2,dp);
        int vert = tiling(n-1,dp);
        int myans = horr +vert;

        return  dp[n] =myans;
    }

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
     int [] dp = new int[n+1];
    int ans = tiling(n,dp);
    System.out.println(ans);
    }
}
