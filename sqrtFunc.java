//69. Sqrt(x)		
class Solution {
    public int mySqrt(int x) {
        
        long low=0;
        long high=x;
       
        long res=-1;
        while(low<=high)
        {
             long mid=low+(high-low)/2;
            if(mid*mid==x)
                return (int)mid;
            else if((mid*mid)>x)
            {
                high=mid-1;
            }
            else
            {
                res=mid;
                low=mid+1;
            }
            
        }
        
        return (int)res;
        
    }
}