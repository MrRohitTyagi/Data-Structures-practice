class Solution {
    
    
    public int helper(int sr,int sc,int dr ,int dc,int [][] dir,int [][] dp){
        
        if(sr == dr && sc == dc){
            
            return dp[sr][sc] = 1;
        }
        int  count = 0;
        if(dp[sr][sc] != 0){
            return dp[sr][sc];
        }
         
        for(int d = 0 ;d < dir.length ;d++){
            
            int nr = sr + dir[d][0];
            int nc = sc + dir[d][1];
            
            if(nr <= dr && nc <= dc){
            
            count += helper(nr,nc,dr,dc,dir,dp);
            }
        }
        
        
        return dp[sr][sc] = count;
        
        
    }
    
    public int uniquePaths(int m, int n) {
        int [][] dp  =new int [m][n];
        int [][] dir ={{0,1},{1,0} };
        
        return helper(0,0,m-1,n-1,dir, dp);
        
        
    }
    
    
}