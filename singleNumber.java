//136-singleNumber (1 non repeating int in array)
class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer,Integer> hs=new HashMap<Integer,Integer> ();
        for(int i=0;i<nums.length;i++)
	        {
            if(hs.containsKey(nums[i]))
	        	hs.put(nums[i],hs.get(nums[i])+1);
            else
                hs.put(nums[i],1);
	        } 
        return 
hs.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Integer,Integer>::getValue)).findFirst().get().getKey();
    }
}
/*
or


public int singleNumber(int[] nums) {

  // variable to store the xor result of all integers
  int sing = nums[0];

  // start a loop for all elements
  for (int i = 1; i < nums.length; i++) {

    // xor the element with the previous result
    sing = sing ^ nums[i];
  }

  // return the result
  return sing;
}
*/