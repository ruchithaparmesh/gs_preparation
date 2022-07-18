//31. Next Permutation

class Solution {
    public void swap(int i,int j,int[] nums)
    {
               int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
    }
    
     public void reverse(int i,int j,int[] nums)
    {
         while(i<j){
               swap(i,j,nums);
             i++;
             j--;
         }
    }
    public void nextPermutation(int[] nums) {
        
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
       // System.out.println(i);
        for(int j=nums.length-1;j>=0;j--)
        {
            if(i>=0 && nums[j]>nums[i])
            {
                swap(i,j,nums);
                break;
            }
            
             
        }
       reverse(i+1,nums.length-1,nums);
        
    }
}

