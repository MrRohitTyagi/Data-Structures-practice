import java.io.*;
import java.util.*;

public class Main {
    public static int FriendPAiring(int n){
        if(n<=1){
            return 1;
        }
        int myans = FriendPAiring(n-1);
        int recans = FriendPAiring(n-2)*(n-1);
        int myans1 = myans+recans;
        return myans1;

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int ans = FriendPAiring(n);
        System.out.println(ans);

    }

}