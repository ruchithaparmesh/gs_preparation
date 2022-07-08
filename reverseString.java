//Reverse String

class Solution {
    public void reverseString(char[] s) {
        
        int j=s.length-1,i=0;
        char temp=' ';
       
       while(i<j)
       {
           temp=s[i];
           s[i]=s[j];
           s[j]=temp;
           j--;
           i++;
       }
        
    }
}