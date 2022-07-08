//Two take the average of marks stored in 2D array and round up to decimal
public class Array2D {
	
	public static void main(String[] args) {
		String [][] arr= {{"Bob","85"},{"Mark","100"},{"Charles","63"},{"zuken","34"}};
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
	int i=0,j=0;	
		for( i=0;i<arr.length;i++)
		{
			
			hs.put(arr[i][0], Integer.parseInt(arr[i][1]));
			System.out.println(hs);
		}
			
			
			double avg=hs.entrySet().stream().collect(Collectors.averagingDouble(Map.Entry<String,Integer>::getValue));
System.out.println(Math.round(avg));
		
	}

}
