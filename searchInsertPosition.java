class Solution {
    public int searchInsert(int[] nums, int target) {
        int res=0;
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                res=i;
                flag=1;
                break;
            }
        }
        
        if(flag==0)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i<nums.length && (target>nums[i] ))
                {
                    res=i+1;
                }
            }
        }
        return res;
    }
}