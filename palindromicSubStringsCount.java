//Palindromic Substrings
//647. Palindromic Substrings

class Solution {
    public boolean checkpalindrome(String s,int i,int j)
    {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
        
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
              if(checkpalindrome(s,i,j))
                {
                    count++;
                }
                    
            }
        }
        return count;
    }
}
