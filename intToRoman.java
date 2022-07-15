//12. Integer to Roman
class Solution {
    public String intToRoman(int num) {
        String romans[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D",                                    "CM","M"};
        int value[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int n = romans.length;
        int i = n-1;
        String ans = "";
         while(num>0){
            while(value[i]<=num){
                ans += romans[i];
                num -= value[i];
            }
            i--;
        }
        return ans;
    }
    
}