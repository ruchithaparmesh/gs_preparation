//66-Plus one 
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        BigInteger res;
        StringBuffer b=new StringBuffer();
        for(int i=0;i<digits.length;i++)
              b.append(digits[i]);
        res=new BigInteger(b.toString().trim());
        res=res.add(BigInteger.ONE);
        String str=res.toString();
        int arr[]=new int[str.length()];
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=Character.getNumericValue(str.charAt(i));
            //arr[i]=str.charAt(i)-'0';
        }
        return arr;
    }
}