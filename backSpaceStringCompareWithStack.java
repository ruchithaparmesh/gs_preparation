//844. Backspace String Compare

class Solution {
    public String stackimp(String s)
    {
        Stack<Character> stack=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i!='#')
                stack.push(i);
            else if(!stack.empty())
                stack.pop();
                
        }
        return stack.toString();
    }
        
    public boolean backspaceCompare(String s, String t) {
        
       
        return stackimp(s).equals(stackimp(t));
        
    }
}