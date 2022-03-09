import java.io.*;
import java.util.*;

public class Main {

    public static int PaintFence(int n ,int k){
        int xx = k;
        int xy =  k*(k-1);

        for(int i = 3; i <=n;i++){
            int nxx = xy;
            int nxy = (xx +xy)*(k-1);

            xx = nxx;
            xy = nxy;
        }
        return xy + xx;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in); 
        int n = scn.nextInt();
        int k = scn.nextInt();
        int [][] dp = new int[2][n+1];

        int ans = PaintFence(n,k);
        System.out.println(ans);
    }
}