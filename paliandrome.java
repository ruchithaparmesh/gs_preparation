//9. Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int originalNum=x;
         while(x>0)
        {
            int r=x%10;
            reversed=reversed*10+r;
            x=x/10;
        }
      return originalNum==reversed;
    }
}