//15. 3Sum
class Solution {
   
    public List<List<Integer>> threeSum(int[] nums) {
        
         Arrays.sort(nums);
        Set<List<Integer>> listOfList  = new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            int low=i+1,high=nums.length-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                   listOfList.add(Arrays.asList(nums[i],nums[low++],nums[high--]));
                }
                
                else if(sum>0)
                       high--;
                else
                       low++;
            }
                       
            
        }
        return new ArrayList<>(listOfList);
}
}