//50. Pow(x, n)
class Solution {
    public double myPow(double x, int pow) {
        double ans=1.0;
        
        long n = pow;
        if(n<0){
            n=-1*n;
            x=1/x;
        }
        while(n>0)
        {
            if(n%2==0)
            {
                x=x*x;
                n=n/2;
            }
            else{ans=ans*x;
            n=n-1;
                }
        }
        return ans;
        
    }
}