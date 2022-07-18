//46. Permutations

class Solution {
     List<List<Integer>> res=new ArrayList<>();

    public  void dfsbacktracking(List<Integer> permutations,List<Integer> dt)
    {
        if(dt.size()==0){
            res.add(permutations);
            return;
        }
        
        for(Integer num:dt)
        {
            List<Integer> temp=new ArrayList<>(permutations);
            List<Integer> tempdt=new ArrayList<>(dt);
            temp.add(num);
            tempdt.remove(num);
            dfsbacktracking(temp,tempdt);
                
        }
      }

    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> dt=new LinkedList<Integer>();
        for(int i:nums){dt.add(i);}

        dfsbacktracking(new ArrayList<>(),dt);
        return res;
    }
}