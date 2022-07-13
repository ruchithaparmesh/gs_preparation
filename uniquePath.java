//62. Unique Paths
class Solution {
      private static int uniquePathsUtil(int m, int n, int[][] dp) {
        if(m == 1 || n == 1) return 1;
        if(dp[m][n] != 0)
            return dp[m][n];
        return dp[m][n] = uniquePathsUtil(m-1, n, dp) + uniquePathsUtil(m, n-1, dp);
    }
    
    public int uniquePaths(int m, int n) {
         int dp[][] = new int[m+1][n+1];
        return uniquePathsUtil(m, n, dp);
       
        
        
     /*   if(m == 1 || n == 1)
            return 1;
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    */
        
        
    }
}