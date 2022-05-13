import java.util.*;

public class Main {

    // ------------------------------- MAZE PATH -------------------------


    public static boolean inRange(int r, int c, int dr, int dc){
        if(r < 0 || r > dr || c < 0 || c > dc)
            return false;
        return true;
    }

    public static int mazePath_1(int sr, int sc, int dr, int dc, String [] dirS, int[][] dir, String asf) {

        if (sc == dc && sr == dr) {
            System.out.println(asf);
            return 1;

        } 
        int count = 0;

        // if(sr+ 1 <= dr){
        //     count += mazePath_1(sr + 1, sc, dr, dc, dirS, dir, asf + "V");
        // }
        // if(sc + 1 <= dc){
        //     count += mazePath_1(sr, sc + 1, dr, dc, dirS, dir, asf + "H");
        // }
        // if(sr + 1 <= dr && sc+1 <= dc){
        //     count += mazePath_1(sr + 1, sc+1, dr, dc, dirS, dir, asf + "D");
        // }

        // OR

        for (int d = 0; d < dir.length; d++) {

            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(r <= dr && c <= dc){

            // if (inRange(r, c, dr , dc )) {
                count += mazePath_1(r, c, dr, dc, dirS, dir, asf +" "+ dirS[d]);
            }
        }
        return count;
        
    }

    public static int mazePath_2Jumps (int sr, int sc, int dr, int dc, String [] dirS, int[][] dir, String asf){

        if(sr == dr && sc == dc){
            System.out.println(asf);
            return 1;
        }
        int count = 0;
        for(int d = 0 ; d< dir.length ; d++){
            for(int moves = 1 ; moves <= Math.max(dr, dc);moves ++){
            
            int nr = sr + (dir[d][0] * moves);
            int nc = sc +  (dir[d][1] * moves);
            if(nc<=dc && nr <= dr){
                count += mazePath_2Jumps(nr, nc, dr, dc, dirS, dir, asf+" " + dirS[d] + moves);
            }



            }



        }
        return count;


    }

    public static void mazePath() {
        int n = 3;
        int m = 4;
        String [] dirS = { "H", "V", "D" };
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };

        // int  ans = mazePath_1(0, 0, n -1, m - 1, dirS, dir, "");
        int  ans = mazePath_2Jumps(0, 0, n -1, m - 1, dirS, dir, "");
        System.out.println(ans);
    }

    public static void main(String[] args) {

        mazePath();

    }
}

    
    //-------------------------- FLOOD FILL --------------------------
    
    
   