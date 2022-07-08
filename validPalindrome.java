//125. Valid Palindrome
//IsPaliandrome
class Solution {
    public boolean isPalindrome(String s) {        
        StringBuilder str=new StringBuilder();
        StringBuilder srev=new StringBuilder();
        for(int i=0;i<s.length();i++)
        { if((s.charAt(i)>='a' && s.charAt(i)<='z' ) || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
            str.append(s.charAt(i));
            srev.insert(0,s.charAt(i));
            }
            else if((s.charAt(i)>='A' && s.charAt(i)<='Z' ))
            {
                char ch=(char)(s.charAt(i)+32);
                str.append(ch);
                srev.insert(0,ch);
            }
        }
        return str.compareTo(srev)==0?true:false;
     
    }
}
