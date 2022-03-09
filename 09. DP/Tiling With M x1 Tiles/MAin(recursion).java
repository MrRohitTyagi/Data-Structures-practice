import java.io.*;
import java.util.*;

public class Main {
    public static int tiling(int n,int m){

        if(m<=0 || n<= 0){
            return 1;
        }
        if(m>n){
            return 1;
        }
        if(m==n){
            return 2;
        }

        int horr = tiling(n-1,m);
        int vert = tiling(n-m,m);
        int myans = horr +vert;
        return myans;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n  = scn.nextInt();
        int m  = scn.nextInt();
        int ans  = tiling(n,m);
        System.out.println(ans);
    } 
}