/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(longestEvenLengthWord(str));
		sc.close();
	}
	public static String longestEvenLengthWord(String str) {
	
	String max="";
	String str1[]=str.split(" ");
//	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	
for(String s:str1)
	{
	if(s.length()>max.length() && s.length()%2==0)
	   max=s;
	
	    
	}
	return max.length()==0?"Not found":max;
}
}