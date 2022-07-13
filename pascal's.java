//118. Pascal's Triangle
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        
        ArrayList <Integer> rowVector = new ArrayList<>();
        
        for(int i=0;i<numRows;i++)
        {
            rowVector.add(0,1);
             
            for(int j=1;j<rowVector.size() - 1 ;j++)
            rowVector.set(j,rowVector.get(j)+rowVector.get(j+1));
            
            
           list.add(new ArrayList<>(rowVector));
        }
            
       return list;     
        
    }
}