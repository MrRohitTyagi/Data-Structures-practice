class Solution {
    
    public int helper(int sr, int sc,int dr,int dc,int[][]obs,int[][]dp){
        
        if(sr == dr && sc == dc){
            return dp[sr][sc]=1;
        }
        if(dp[sr][sc]  !=0){
            return dp[sr][sc];
        }
        int count = 0;
        
        if(sr + 1 <= dr && obs[sr+1][sc] == 0){
            count += helper(sr+1,sc,dr,dc,obs,dp);
        }
        if(sc + 1 <= dc && obs[sr][sc+1] == 0){
            count += helper(sr,sc+1,dr,dc,obs,dp);
        }
        return dp[sr][sc]=count;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        if(n == 0 || m == 0)
            return 0;
        
        //agr start of end me block hai toh return 0
        
        if(obstacleGrid[0][0] == 1 || obstacleGrid[n-1][m-1] == 1)
            return 0;
        int [][] dp = new int[n][m];
        
        int ans = helper(0,0,n-1,m-1,obstacleGrid,dp);
        return ans;
                           
            
        
    }
}