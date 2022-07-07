//3. Longest Substring Without Repeating Characters
//Sliding window algo
class Solution {
    public int lengthOfLongestSubstring(String str) {
        int max=0;

        for(int i=0;i<str.length();i++)
        {
            boolean[] visited = new boolean[256];

            for(int j=i;j<str.length();j++)
            {
               if (visited[str.charAt(j)] == true)
				   break;
               else
                {
                 
                    visited[str.charAt(j)]=true;
                    max=Math.max(max,j-i+1);
                }
            }
          
        }
        return max;
        
        
    }
}
