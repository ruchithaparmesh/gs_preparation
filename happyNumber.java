//202:happyNumber
class Solution {
    public int returnSum(int n)
    {
        int sum=0;
         while(n>0)
        {
            int lastnum=n%10;
            sum=sum+lastnum*lastnum;
            n=n/10;
        
        }
     return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<Integer>();
        while(!set.contains(n) && n!=1)
        {
            set.add(n);
            n=returnSum(n);
        }
        return n==1;
       
    }
    
}