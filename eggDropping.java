//Dropping egg
public class EggDropping {
	
	public static int drop(int n,int k,int [][]mem)
	{
		
		
		int min=Integer.MAX_VALUE;
		if(!(mem[n][k]==-1))
			return mem[n][k];
		if(k==1||k==0)
			return k;
		if(n==1)
		{
			return k;
		}
		int res=0;
		for(int i=2;i<=k;i++)
		{
		res=Math.max(drop(n-1, i-1,mem),drop(n,k-i,mem));
		if(res<min)
			min=res;
		}
		mem[n][k] = min + 1;
		return (min+1);
	}
	public static void main(String[] args) {
		int n=4;
		int k=99;
	//	int mem[][]=new int[n+1][k+1];
		int mem[][]=new int[100][100];
		for(int i=0;i<mem.length;i++)
		{
			Arrays.fill(mem[i], -1);
		}
		System.out.println(drop(4,99,mem));
	}

}