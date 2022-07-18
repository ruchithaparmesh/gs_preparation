//576. Out of Boundary Paths
class Solution {
    long M = 1000000007;
    public long recursiveFindPath(int m,int n,int N,int r,int c,int dp[][][])
    {
      
        if(r<0 || c<0 || r>m-1|| c>n-1)
            return 1;
         if(dp[r][c][N]!=-1)
            return dp[r][c][N];
     
        long res=0;
        res+=recursiveFindPath(m,n,N-1,r+1,c,dp)%M
        +recursiveFindPath(m,n,N-1,r-1,c,dp)%M
        +recursiveFindPath(m,n,N-1,r,c+1,dp)%M
        +recursiveFindPath(m,n,N-1,r,c-1,dp)%M;
       dp[r][c][N]=(int)(res%M);
        return dp[r][c][N];
        
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        
        int dp[][][]=new int[m][n][maxMove+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                Arrays.fill(dp[i][j],-1);
                dp[i][j][0]=0;
            }
        }
        return (int)recursiveFindPath(m,n,maxMove,startRow,startColumn,dp);
        
        
    }
}
