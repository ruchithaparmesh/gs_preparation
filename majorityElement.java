//169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int max=nums.length/2;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else hm.put(nums[i],1);
                
        }
        
        return hm.entrySet().stream().filter(x->x.getValue()>max).findFirst().get().getKey();
        
        
       /* Arrays.sort(nums);
        return nums[max];*/
    }
}