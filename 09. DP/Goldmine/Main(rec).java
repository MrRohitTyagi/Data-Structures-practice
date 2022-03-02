import java.io.*;
import java.util.*;

public class Main {

     public static int goldmine(int i , int j  ,int [][] arr){

         if(i<0 || j<0 || i >= arr.length || j>= arr[0].length){

            return 0;
         }

         int a = goldmine(i-1,j+1,arr);
         int b =  goldmine(i,j+1,arr);
         int c = goldmine(i+1,j+1,arr);

         int max = Math.max(a,Math.max(b,c))+arr[i][j];
         return max;


     }
    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int [n][m]; 
        int [][] dp = new int [n][m]; 
        for (int i = 0; i < n; i++) {
            for(int j = 0 ; j<m ;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int max = -1;
        for( int i = 0 ; i<n ;i++) {
            int ans = goldmine(i,0,arr);
            max = Math.max(max,ans);
        }
        System.out.println(max);
        
    }

}