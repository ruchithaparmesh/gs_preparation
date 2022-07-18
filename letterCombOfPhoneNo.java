//17. Letter Combinations of a Phone Number

class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Character,List<String>> hm=new HashMap<>();
       
        hm.put('2', Arrays.asList("a","b","c"));
        hm.put('3', Arrays.asList("d","e","f"));
        hm.put('4', Arrays.asList("g","h","i"));
        hm.put('5', Arrays.asList("j","k","l"));
        hm.put('6', Arrays.asList("m","n","o"));
        hm.put('7', Arrays.asList("p","q","r","s"));
        hm.put('8',Arrays.asList("t","u","v"));
        hm.put('9',Arrays.asList("w","x","y","z"));
        List<String> res=new ArrayList<String>();
        for(int i=0;i<digits.length();i++)
        {
            List<String> list=hm.get(digits.charAt(i));
            if(res.isEmpty())
            {
                res.addAll(list);
            }
            else
            {
                List<String> temp=new ArrayList<String>();
                for(String s:res)
                {
                    for(String s1:list)
                    {
                        temp.add(s+s1);
                    }
                }
                res.clear();
                res.addAll(temp);
            }
            
        }
        return res;
    }
}