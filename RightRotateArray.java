//189-Rotate Array
  class Solution {
    public void rotate(int[] nums, int k) {
       if(nums.length>1 && nums.length>k){
        int numsd[]=new int[nums.length];
        System.arraycopy(nums,nums.length-k,numsd,0,k);
        System.arraycopy(nums,0,numsd,k,nums.length-k);
        for(int i=0;i<numsd.length;i++)
        {
           nums[i]=numsd[i];
        }
        }else
       {
           while(k>0)
           {
               int last=nums[nums.length-1];
               
               for(int j=nums.length-1;j>0;j--)
               {
                   nums[j]=nums[j-1];
               }
               nums[0]=last;
               k--;
           }
       }
        
    }
}