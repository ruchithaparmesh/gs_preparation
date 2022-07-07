class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2;

	for (int j = 2; j < nums.length; j++)
		if (nums[j] > nums[i - 2])
			nums[i++] = nums[j];

	return i;

    /*
        int n=arr.length;
        int j=1;
        int count=0;
        int k=2;
        int x=0;
        for(int i=0;i<n;i+=count)
        {   count=1;
            j=i+1;
            while(j<n)
            {
                if(arr[i]==arr[j])
                    count++;
                j++;
            }
            if(count>=2)
            {
                arr[x++]=arr[i];
                arr[x++]=arr[i];
            }
             if(count==1)
            {
                arr[x++]=arr[i];
            }
        }
  
        return x; working*/
        
        
   
        
        
        
    }
}