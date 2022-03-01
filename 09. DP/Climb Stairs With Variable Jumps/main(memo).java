import java.io.*;
import java.util.*;

public class Main {

    public static int climbStairVJMemo(int src, int dest, int [] arr, int [] dp){
        if(src == dest){
            return dp[src] = 1;
        }
        if(dp[src] != 0)
            return dp[src];

        int count = 0;
        for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
            count += climbStairVJMemo(src + jump, dest, arr, dp);
        }
        return dp[src] = count;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scn.nextInt();


        int [] dp = new int[n+1];

        
        int ans = climbStairVJMemo(0, n, arr, dp);
        
        System.out.println(ans);
    }
}