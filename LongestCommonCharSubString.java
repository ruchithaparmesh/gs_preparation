private static int[] longestRepeatingChars() {
		  
		  String str="aaabbbcccdddddeeeaaa";
		  int n = str.length();
		    int count = 0;
		    char res = str.charAt(0);
		    int cur_count = 1;

		    for (int i = 0; i < n; i++)
		    {
		      if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
		        cur_count++;


		      else
		      {
		        if (cur_count > count)
		        {
		          count = cur_count;
		          res = str.charAt(i);
		        }
		        cur_count = 1;
		      }
		    }
              return new int[] {str.indexOf(res)+1,count};
 }

public static void main(String[] args) {

 int arr2[]=longestRepeatingChars();
		 System.out.println("  "+arr2[0]+" "+arr2[1]);

	}


	
}