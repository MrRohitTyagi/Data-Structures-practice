public class Main {

    public static void main(String[] args) {

        // floodFill();
        myFloodFill();

    }

    public static boolean inRange(int r, int c, int dr, int dc) {
        if (r < 0 || r >= dr || c < 0 || c >= dc)
            return false;
        return true;
    }

    // -------------------------- FLOOD FILL --------------------------

    public static void myFloodFill() {

        int n = 3;
        int m = 3;

        boolean[][] vis = new boolean[n][m];

        int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 } };

        String[] side = { "TL", "T", "TR", "R", "BR", "B", "BL", "L" };

        int ans = myFloodFill_1(0, 0, n - 1, m - 1, vis, dir, side, "");
        // int ans = myFloodFill_1Jumps(0, 0, n - 1, m - 1, vis, dir, side, "");
        System.out.println(ans);
    }

    public static int myFloodFill_1(int sr, int sc, int dr, int dc, boolean[][] vis, int[][] dir, String[] dirN,

            String asf) {

        if (sr == dr && sc == dc) {
            System.out.println(asf);
            return 1;
        }
        vis[sr][sc] = true;
        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            int nr = sr + dir[d][0];
            int nc = sc + dir[d][1];

            if (nr <= dr && nr >= 0 && nc <= dc && nc >= 0 && !vis[nr][nc]) {

                count += myFloodFill_1(nr, nc, dr, dc, vis, dir, dirN, asf + " " + dirN[d]);
            }
        }
        vis[sr][sc] = false;
        return count;

    }


    public static int myFloodFill_1Jumps(int sr, int sc, int dr, int dc, boolean[][] vis, int[][] dir, String[] dirN,

            String asf) {

        if (sr == dr && sc == dc) {
            System.out.println(asf);
            return 1;
        }
        vis[sr][sc] = true;
        int count = 0;

        for (int d = 0; d < dir.length; d++) {

            for(int moves = 1 ; moves <= Math.max(dr, dc);moves ++){
            
                int nr = sr + (dir[d][0] * moves);
                int nc = sc +  (dir[d][1] * moves);

            if (nr <= dr && nr >= 0 && nc <= dc && nc >= 0 && !vis[nr][nc]) {

                count += myFloodFill_1(nr, nc, dr, dc, vis, dir, dirN, asf + " " + dirN[d] + moves);
            }
        }
        }
        vis[sr][sc] = false;
        return count;

    }

}
