//40. Combination Sum II
class Solution {
    
    public void combineSumWithoutRep(int []candidates,int index,int target,List<Integer> curList,List<List<Integer>> res)
    {
        if(target==0)
            res.add(new ArrayList<Integer>(curList));
        
        
        if(target<0)
            return ;
        for(int i=index;i<candidates.length;i++)
        {
            if(i==index||candidates[i]!=candidates[i-1] )
            {
                 curList.add(candidates[i]);                            
                 combineSumWithoutRep(candidates,i+1,target-candidates[i],curList,res);
                 curList.remove(new Integer(candidates[i]));
            }
        }
        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        if(candidates==null)
            return null;
        
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        combineSumWithoutRep(candidates,0,target,new ArrayList<>(),res);
        return res;
        
        
    }
}
