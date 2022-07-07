//74. Search a 2D Matrix

class Solution {
    public int binarySearch(int arr[],int l,int r,int target)
    {
        int mid=0;
        if(l<=r){
            mid=l+(r-l)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]>=target)
            return binarySearch(arr,0,mid-1,target);
        else
            return binarySearch(arr,mid+1,r,target);
        }
        return -1;

        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            int x=binarySearch(matrix[i],0,matrix[i].length-1,target);
            if(x!=-1)
                return true;
                
                
        }
        return false;
    }
}
