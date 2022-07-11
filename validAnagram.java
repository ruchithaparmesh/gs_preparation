//242. Valid Anagram
class Solution {
   /* public boolean isAnagram(String s, String t) {
        
       String str1[]=s.split("");
        Arrays.sort(str1);
        
        String str2[]=t.split("");
        Arrays.sort(str2);
        
        
        if(Arrays.toString(str1).equals(Arrays.toString(str2)))
            return true;
        else
            return false;
    }*/
    public boolean isAnagram(String s, String t) {
        
        int[] map = new int[26];
        for (char ch : s.toCharArray()) {
            map[ch - 'a']++;
        }
        
        for (char ch : t.toCharArray()) {
           if (map[ch - 'a']-- < 0) {
               return false;
           }
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
       
        return true;
    }
}

