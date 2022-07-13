//81. Search in Rotated Sorted Array II
class Solution {
    
    public boolean bs(int[] nums,int low,int high,int target)
    {
        int mid=low+(high-low)/2;
        if(low<=high){
        if(nums[mid]==target)
            return true;
        else
            if(target>nums[mid])
                return bs(nums,mid+1,nums.length-1,target);
        else
           return  bs(nums,low,mid-1,target);
        }
        else
            return false;
    }
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        return bs(nums,0,nums.length-1,target);
        
       
        
        
    }
}