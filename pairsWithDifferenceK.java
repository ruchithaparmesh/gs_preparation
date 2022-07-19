/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static int countPairsWithDiffK(int arr[], int n, int k)
	{
	
	HashSet<Integer> hs=new HashSet<Integer>();
	int count=0;
	for(int i=0;i<n;i++)
	{
	if(hs.contains(arr[i]+k))
	     count++;
	else hs.add(arr[i]);
	}

	
	return count;
	}
	public static void main (String[] args) {
		int arr[] = { 5,1, 5, 3, 4, 2 ,2};
		int n = arr.length;
		int k = 3;
		System.out.println("Count of pairs with given diff is "
							+ countPairsWithDiffK(arr, n, k));
	}
}