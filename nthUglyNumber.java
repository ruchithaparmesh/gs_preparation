//NthuglyNumbeer 
public class UglyNumbers {
	public static boolean loop(int n)
	{
		while(n%2==0) n=n/2;
		while(n%3==0) n=n/3;
		while(n%5==0) n=n/5;
		if(n==1)return true;
		return false;
		
	}
	
	
	private static int getNthUgly(int n) {
		
         int i=0;
         int count=0;
         while(n>count)
         {
        	 i++;
        	 if(loop(i))
        		 count++;
         }
         return i;
	}
	
  public static void main(String[] args) {
	int n=7;
	
	
	
	System.out.println(getNthUgly(n));
}

}