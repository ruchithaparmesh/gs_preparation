//2042. Check if Numbers Are Ascending in a Sentence
class Solution {
  
    public boolean areNumbersAscending(String s) {
    
        String str1[]=s.split(" ");
        int num=0;
        int  newnum=0;
        for(String s2:str1)
        {
            if(s2.matches("[0-9]+"))
            {
             newnum=Integer.parseInt(s2);
                if(newnum<=num)
                     return false;
                  num=newnum;
            }
                
            }
        
        return true;
        
    }
}