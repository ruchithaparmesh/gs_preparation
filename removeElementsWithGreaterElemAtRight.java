//1299. Replace Elements with Greatest Element on Right Side
class Solution {
  /*  public int getMax(int arr[])
    {
        return Arrays.stream(arr).max().getAsInt();
    }*/
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        int max=Integer.MIN_VALUE;
        /*for(int i=0;i<n;i++)
        {
            arr1[i]=getMax(Arrays.copyOfRange(arr,i+1,n+1));
        }*/
        
       for(int i = arr.length-1; i > 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
            }
            arr1[i-1] = max;
        }

        arr1[n-1]=-1;
        return arr1;
        
    }
}