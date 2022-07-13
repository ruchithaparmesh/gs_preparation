//917. Reverse Only Letters
class Solution {
    public boolean checkChar(char c)
    {
         if((c >= 'a' && c<='z' )|| (c >= 'A' && c<='Z'))
            return true;
        return false;
        
    }
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char temp=' ';
        char a[]=s.toCharArray();
        while(i<=j)
        {
            while(i<j && !checkChar(a[i])) i++;
            while(i<j && !checkChar(a[j])) j--;
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
                i++;
                j--;
           
          
           
        }
        return String.valueOf(a);
        
    }
}