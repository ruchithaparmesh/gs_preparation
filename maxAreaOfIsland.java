//695. Max Area of Island


class Solution {
   boolean seen[][];

    public int calcArea(int r ,int c,int grid[][])
    {
        
        if(r<0 || r>grid.length-1|| c<0 || c>grid[r].length-1 || grid[r][c]==0 ||seen[r][c]==true)
         {
            return 0;}
       
        seen[r][c]=true;
        return (1+ calcArea(r+1,c,grid)+ calcArea(r-1,c,grid)+ calcArea(r,c+1,grid)+
                       calcArea(r,c-1,grid));
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        int r=grid.length;
        int c=grid[0].length;
        seen=new boolean[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                maxArea=Math.max(maxArea,calcArea(i,j,grid));
            }                
        }
        return maxArea;
    }
}
