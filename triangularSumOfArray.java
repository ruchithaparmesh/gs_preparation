//2221. Find Triangular Sum of an Array
class Solution {
    public int triangularSum(int[] nums) {
       int j=nums.length;
        while(j!=1)
        {
        for(int i=0;i<j-1;i++)
        {
            nums[i]=(nums[i]+nums[i+1])%10;
        }
            j--;
        }
      
        return nums[0];
        /*
         int len  = nums.length;
        if(len==1)
            return nums[0];
        int []newNum = new int[len-1];
        for(int i=0;i<len-1;i++){
            newNum[i]  =  (nums[i]+nums[i+1])%10;
        }
        return triangularSum(newNum);*/
    }
}
