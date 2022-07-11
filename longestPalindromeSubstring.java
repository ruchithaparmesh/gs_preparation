//5. Longest Palindromic Substring --using dp
class Solution { 
    public int solve(int [][] array,int i,int j,String str)
    {
        if (array[i][j] != -1) {
            return array[i][j];
        }
        array[i][j] = 0;
        if(i==j)
            return array[i][j]=1;
        if(j-i==1)
        {
            if (str.charAt(i)==str.charAt(j))
                return array[i][j]=1;
            else
                return array[i][j]=0;
        }
        if (str.charAt(i)==str.charAt(j) && solve(array,i+1,j-1,str)==1)
        {
              array[i][j]=1;
        }
        
        return array[i][j];
            
}
 
    public  String longestPalindrome(String str) {
        int n=str.length();
        int startIndex=0;
        int maxLength=0;
        
        int array[][]=new int[n][n];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = -1;
            }
        }
          for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                solve(array, i, j, str);
                if(array[i][j]==1 && j-i+1>maxLength)
                {
                    startIndex=i;
                    maxLength=j-i+1;
                }
            }
          }
        return str.substring(startIndex,maxLength+startIndex);
       
    }
}