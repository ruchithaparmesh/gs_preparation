//39. Combination Sum
class Solution {
    public void findCombSum(int []candidates,int index,int target,List<Integer>  curList,List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(curList));
            return;
        }
        
         for(int i=index;i<candidates.length;i++)
       // for(int i=0;i<candidates.length;i++)  //if we want permutation of sum
        {
            if(candidates[i]<=target){
                curList.add(candidates[i]);
                findCombSum(candidates,i,target-candidates[i],curList,res);
                curList.remove(new Integer(candidates[i]));
            }
                
            
                
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        if(candidates==null)
            return null;
        
         List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        findCombSum(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
}