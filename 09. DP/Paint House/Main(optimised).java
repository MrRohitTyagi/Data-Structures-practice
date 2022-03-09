import java.io.*;
import java.util.*;

public class Main {
    public static int PAintHouse(int n,int [][] arr){
        int r= arr[0][0];
        int g= arr[0][1];
        int b= arr[0][2];

        for(int i =1 ; i <n;i++){
            int nr=arr[i][0]+Math.min(g , b);
            int ng=arr[i][1]+Math.min(r , b);
            int nb=arr[i][2]+Math.min(r , g);
            r =nr;
            g=ng;
            b=nb;
            
        }
        return Math.min(r,(Math.min(g,b)));


    }
   
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int [n][3];
        for( int i=0 ;i<n  ;i++  ) {
            for(int j = 0 ;j<3;j++){
                arr[i][j]= scn.nextInt();
            }
        }
        int [][] dp = new int[n][3];
        int ans = PAintHouse(n,arr);
        System.out.println(ans);
    }
}