//8. String to Integer (atoi)

class Solution {
    public int myAtoi(String s) {
    
        s=s.trim();
        if(s.length()==0)
            return 0;
        int sign=1;
        int i=0;
        if(s.charAt(i)=='+'){
            sign=1;i++;
        }
        else if(s.charAt(i)=='-'){
            sign=-1;i++;
        }
        long num=0;
        for(;i<s.length();i++){
            char c=s.charAt(i);
            if(!(c>='0'&&c<='9'))
                break;
            int digit=c-'0';
            num=num*10+digit;
            if(sign*num>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(sign*num<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        
        }
        return (int)(sign*num);
    }
    
}
