
import java.util.stream.Collectors;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] nums3=new int[nums1.length+nums2.length];
        
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        
        
       Object res= Arrays.asList(Arrays.stream(nums3)
  .boxed()
  .toArray(Integer[]::new)).stream().sorted().collect(Collectors.collectingAndThen(Collectors.toList(),
        list -> {
                          int count = list.size();
                          if (count % 2 == 0) { 
                              int x=list.get((count / 2) - 1) ;
                              int y= list.get(count / 2);
                              return (x+y)/(double)2;
                          } else { 
                              return list.get(count / 2);
                          }
                      }));                                                                             
        return Double.parseDouble(res.toString());
    }
}