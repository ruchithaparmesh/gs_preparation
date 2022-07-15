//599. Minimum Index Sum of Two Lists

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        List<String> ls=new ArrayList<String>();
        Integer min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
         hm.put(list1[i],i);
        }
        
        Integer j=null;
        for(int i=0;i<list2.length;i++)
        {
           j= hm.get(list2[i]);
                if( j!=null && i+j<=min)
                {
                     
                    if (i + j < min) 
                    {  
                        min = i+j; 
                        ls.clear(); 
                    } 
                 ls.add(list2[i]);
                }
        }
        return ls.toArray(new String[ls.size()]);
        
    }
}