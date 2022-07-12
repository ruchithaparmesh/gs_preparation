//1365. How Many Numbers Are Smaller Than the Current Number
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    /*    int s[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                    count++;
            }
            s[i]=count;
        }
        return s;
        */
        int extra[]=nums.clone();
        Arrays.sort(nums);
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.containsKey(nums[i]))
                hs.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
         extra[i]=hs.get(extra[i]);   
        }
        return extra;
        
    }
}