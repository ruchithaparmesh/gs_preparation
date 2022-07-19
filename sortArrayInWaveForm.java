import java.util.Arrays;

public class SortArrayInWayve {

	public static void main(String[] args) {
		sortInWave(new int[] {10, 5, 6, 3, 2, 20, 100, 80});
		
	}

	private static void sortInWave(int[] arr) {

		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length-1;i+=2)
		{
			System.out.println(i);
			swap(i,i+1,arr);
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void swap(int i, int j,int arr[]) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}