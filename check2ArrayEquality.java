//check2ArrayEquality

import java.util.HashMap;

public class Check2ArraysEquality {

	public static boolean checkEquality(int arr1[],int arr2[])
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			if(hm.containsKey(arr1[i]))
			{
				hm.put(arr1[i], hm.get(arr1[i])+1);
			}
			else hm.put(arr1[i], 1);
		}
		System.out.println(hm);
		for(int i=0;i<arr2.length;i++)
		{
			if(hm.containsKey(arr2[i]) && hm.get(arr2[i])>1)
			{
				hm.put(arr2[i], hm.get(arr2[i])-1);
			}
			else if(hm.containsKey(arr2[i]) && hm.get(arr2[i])==1)
			{
				hm.remove(arr2[i]);
			}
			else return false;
		}
		System.out.println(hm);
		return hm.size()==0?true:false;
	}
	public static void main(String[] args) {
		System.out.println(checkEquality(new int[] {1, 2, 6, 4, 1},new int[] {2, 4, 5, 1, 1,7,8}));
	}
}