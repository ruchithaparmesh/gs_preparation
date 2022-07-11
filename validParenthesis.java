//20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{')
                stack.push(s.charAt(i));
            else{ 
                
                if(!stack.isEmpty()){
                if(s.charAt(i)==']' && stack.peek()!='[' )
                return false;
             else if( s.charAt(i)==')' && stack.peek()!='(')
                return false;
             else if( s.charAt(i)=='}' && stack.peek()!='{')
                return false;
            stack.pop();
                }
                else return false;
                }
            
        }
      if(stack.isEmpty())
            return true;
     return false;
        
    }
}