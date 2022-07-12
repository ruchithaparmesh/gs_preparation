//1684. Count the Number of Consistent Strings
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count[]=new int[26];
        for(int i=0;i<allowed.length();i++)
        {
            count[allowed.charAt(i)-'a']++;
        }
        int counts=0;
        boolean flag=false;
        for(String s:words)
        {
              flag=true;
             for(int i=0;i<s.length();i++)
            {
               if(count[s.charAt(i)-'a']==0)
               { 
                   flag=false;
                   break;
                
               }
                  
            }
            if(flag)
                counts++;
        }
        return counts;
    }
}
