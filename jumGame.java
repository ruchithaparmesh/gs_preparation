//55. Jump Game
class Solution {
    public boolean canJump(int[] nums) {
       
        
        int lastIndex=nums.length-1;
        for(int i=lastIndex;i>=0;i--)
        {
            if(i+nums[i]>=lastIndex)
                lastIndex=i;
        }
        return lastIndex==0;
    }
}