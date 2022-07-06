class Solution {
    public int removeDuplicates(int[] nums) {
        
     TreeSet<Integer> hs=new TreeSet<Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	        	hs.add(nums[i]);
	        }
      
         int i=0;
	        for(int a:hs)
	        {
	        	nums[i]=a;
	        	i++;
	        	
	        }
	        return hs.size();
        
    }
}