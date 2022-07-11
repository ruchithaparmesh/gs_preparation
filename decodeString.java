//394. Decode String
class Solution {
    public String decodeString(String s) {
        
        
        Stack<String> str=new Stack<String>();
        Stack<Integer> num=new Stack<Integer>();
        int i=0;
        StringBuilder res=new StringBuilder();
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i))){
            StringBuilder b=new StringBuilder();
            while(Character.isDigit(s.charAt(i)))
            {
                  b.append(s.charAt(i));
                i++;
            }
                num.push(Integer.parseInt(b.toString()));
            }
               
            
            else if(s.charAt(i)=='[')
            {
                str.push(res.toString());
                res = new StringBuilder("");
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder temp=new StringBuilder(str.pop());
                int counts=num.pop();
                for(int j=0;j<counts;j++)
                {
                    temp.append(res);
                }
                res=temp;
                i++;
            }
            else
            {
                res.append(s.charAt(i));
                i++;
            }
                
                
        }
        return res.toString();
    }
}