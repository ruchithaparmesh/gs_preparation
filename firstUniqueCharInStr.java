//387. First Unique Character in a String			
			
			class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);
            if(map.containsKey(s.charAt(i)))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        
       Map.Entry<Character,Integer> first=map.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Character,Integer>::getValue)).findFirst().get();
        
        if(first.getValue()==1)
        return s.indexOf(first.getKey());
        else
            return -1;
    }
}