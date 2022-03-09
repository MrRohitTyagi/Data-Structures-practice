import java.io.*;
import java.util.*;

public class Main {
    public static int tiling(int n){
        if(n<=1){
            return 1;
        }
        int horr = tiling(n-2);
        int vert = tiling(n-1);
        int myans = horr +vert;

        return myans;
    }

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int ans = tiling(n);
    System.out.println(ans);
    }
}