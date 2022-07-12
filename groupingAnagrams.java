//49. Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hmap = new HashMap<String, List<String>>();
    for (String s : strs) {
        char[] cur = s.toCharArray();
        Arrays.sort(cur);
        String curString = String.valueOf(cur);
        if (!hmap.containsKey(curString))
            hmap.put(curString, new ArrayList<String>());
        hmap.get(curString).add(s);
    }
    List res = new ArrayList<List<String>>();
    hmap.forEach((key, value) -> res.add(value));
    return res;
    }
}