import java.io.*;
import java.util.*;

public class Main {
    public static int FriendPAiring(int n,int [] dp){
        if(n<=1){
            return dp[n] = 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        int myans = FriendPAiring(n-1,dp);
        int recans = FriendPAiring(n-2,dp)*(n-1);
        int myans1 = myans+recans;
        return dp[n] = myans1;

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] dp = new int [n+1];
        int ans = FriendPAiring(n,dp);
        System.out.println(ans);

    }

}
