class Solution {
    public void sortColors(int[] arr) {
       /* int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            j=i+1;
            while(j<n)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }*/
        
        
        int low=0,mid=0;
        int high=arr.length-1;
        int temp=0;
        while(mid<=high)
        {
            
        switch(arr[mid])
        {
            case 0:
                {temp=arr[low];
                 arr[low]=arr[mid];
                 arr[mid]=temp;
                 low++;
                 mid++;
                 break;
                 }
            case 1:
                mid++;
                break;
            case 2:
                temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
                break;
        }
        }
        
    }
}