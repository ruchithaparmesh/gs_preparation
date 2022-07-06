//350-Intersection of Two Arrays 11
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          if(nums1.length>nums2.length)
          
              return intersect(nums2,nums1);
        int size=nums1.length>nums2.length?nums1.length:nums2.length;
        int nums3[]=new int[size];
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        int j=0;
      
    for(int i=0;i<nums1.length;i++)
    {
        hs.put(nums1[i],hs.getOrDefault(nums1[i],0)+1);
    }
    
        
        for(int i=0;i<nums2.length;i++)
        {
            if(hs.getOrDefault(nums2[i],0)>0)
            {
                nums3[j]=nums2[i];
            j=j+1;
               hs.put(nums2[i],hs.get(nums2[i])-1);
            }
        }
        
         return Arrays.copyOf(nums3,j);
    }
}