//Contains duplicate:217

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
	        {
	        	hs.add(nums[i]);
	        }        
        if(hs.size()==nums.length)
            return false;
        else return true;
        
        
        /*for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            while(j<nums.length){
            if(nums[i]==nums[j])
            {
                return true;
            }
            j++;
            }
            
        }
        return false;*/
    }
}