//73. Set Matrix Zeroes

class Solution {
    
    Set<Integer> row=new HashSet<Integer>();
     Set<Integer> col=new HashSet<Integer>();

  /*  public void search(int matrix[],int low,int high,int target )
    {
      for(int i=0;i<matrix.length;i++)
      {
          if(target==matrix[i])
              return target;
      }
    }
    */
  
     public void putZeros(int [][]matrix)
     {
          for(int i=0;i<matrix.length;i++)
           {
             for(int j=0;j<matrix[i].length;j++)
               {
                if(row.contains(i) || col.contains(j))
                    matrix[i][j]=0;
            }
          }

      }

    public void setZeroes(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                   row.add(i);
                   col.add(j);
                }
                    
            }
        }
        putZeros(matrix);
        
    }
}
