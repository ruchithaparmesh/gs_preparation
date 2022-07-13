//119. Pascal's Triangle II

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        ArrayList<Integer> row=new ArrayList<Integer>();
      /*  for(int i=0;i<=rowIndex;i++)
        {
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j,row.get(j)+row.get(j+1));
            
            
            
        }
        return row;*/
       
    int[][] dp = new int[rowIndex + 1][rowIndex + 1];
    dp[0][0] = 1; 
      
    for (int i = 1; i <= rowIndex; i++)
        for(int j = 0; j<= i ; j++){
            if(j == 0)
                 dp[i][j] = dp[i-1][j];
            else
                 dp[i][j] = dp[i-1][j-1] + dp[i-1][j]; 
      

        }
           
      for(int i : dp[rowIndex])
          row.add(i);
      
      return row;
        
    }
}
k