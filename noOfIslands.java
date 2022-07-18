//200. Number of Islands

class Solution {
    public void checkConnect(int r,int c,char[][] grid)
    {
        if(r<0 || c<0 || r> grid.length-1 || c>grid[0].length-1 ||  grid[r][c]=='0' )
            return;
        
        grid[r][c]='0';
        checkConnect(r+1,c,grid);checkConnect(r-1,c,grid);checkConnect(r,c+1,grid);
        checkConnect(r,c-1,grid);
            
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    checkConnect(i,j,grid);
                }
            }
        }
        return count;
    }
}