//1859. Sorting the Sentence
class Solution {
    public String sortSentence(String st) {
        
        String str[]=st.split(" ");
        String str2[]=new String[str.length];
        StringBuilder sb=new StringBuilder();
        for(String s:str)
        {
            str2[(s.charAt(s.length()-1)-'0')-1]=s.substring(0,s.length()-1);
          //  s.insert(s.charAt(s.length()-1)-'0',s.substring(0,s.length()-1));
            
        }
        for(String s1:str2)
        {
            sb.append(s1+" ");
        }
        
        return sb.toString().trim();
        
        
    }
}