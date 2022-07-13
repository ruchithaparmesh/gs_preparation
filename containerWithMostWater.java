//11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {
            int i = 0 ;
        int j = height.length - 1 ;
        int area = 0 ;
        int max = 0 ;
        while(i <= j){
             if(height[i] > height[j]){
                area = (j-i) * height[j] ;
                 j-- ;
               }
             else{
                area = (j-i) * height[i] ;
                i++ ;
               }
             if(max < area){
                 max = area ;
              }
    }
	return max;
}
}