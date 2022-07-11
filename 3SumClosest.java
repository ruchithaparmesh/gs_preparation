//3 sum closest
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[nums.length-1];
        int crntsum=0;
    
        for(int i=0;i<nums.length-2;i++)
        {
            int low=i+1,high=nums.length-1;
            while(low<high)
            {
                 crntsum=nums[i]+nums[low]+nums[high];
                if(crntsum>target)
                    high--;
                else
                    low++;
                
                if(Math.abs(crntsum-target)< Math.abs(closest-target))
                    closest=crntsum;
            }
        }
        
    return closest;
    }
        
}