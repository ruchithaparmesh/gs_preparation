//34. Find First and Last Position of Element in Sorted Array
class Solution {
    public int findFirstBinarySerach(int nums[],int low,int high,int target,int n)
    {
         
         if (high>= low) {
            
      
         int mid=low + (high - low) / 2;
         
       
        if((mid == 0 || target > nums[mid - 1]) && nums[mid]==target)
            return mid;
        else if(target>nums[mid])
            
           return  findFirstBinarySerach(nums, (mid+1), high, target,n);
        else
           return  findFirstBinarySerach(nums, low, (mid-1),target,n);
        }
        return -1;
    }
    public int findLastBinarySerach(int nums[],int low,int high,int target,int n)
    {
        
        if (high >= low) {
      int mid = low + (high - low) / 2;
       
        if ((mid == n - 1 || target < nums[mid + 1]) && target==nums[mid])
                return mid;
        else if(target<nums[mid])
           return  findLastBinarySerach(nums, low, mid-1,target,n);
        else 
           return  findLastBinarySerach(nums, mid+1, high, target,n);
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int n = nums.length;
        if(n>0){
             int x= findFirstBinarySerach(nums,0,nums.length-1,target,n);
             int y= findLastBinarySerach(nums,0,nums.length-1,target,n);
        return new int[]{x,y};
        }
        else
            return new int[]{-1,-1};


    }
}
