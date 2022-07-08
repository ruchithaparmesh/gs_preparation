//14. Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder commonPrefix = new StringBuilder();
        int i = 0;
        while(strs.length > 0 && strs[0].length() >i){
            char firstchar = strs[0].charAt(i);
            for (String str: strs){
                if(str.length() <= i || str.charAt(i) != firstchar){
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(firstchar);
            i++;
        }
        return commonPrefix.toString();
    } 
}