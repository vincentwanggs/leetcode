public class CombinationSumII {
    public void helper (int depth, int sum, int target, int[] candidates, ArrayList<Integer> sol, ArrayList<ArrayList<Integer>> res){
  
    if (sum == target && !res.contains(sol)){
      res.add(new ArrayList<Integer> (sol));
      return;
    }
    if (sum > target){
      return;  
    }
    else{
      for (int i = depth; i < candidates.length; i ++){
         sol.add(candidates[i]);
         helper (i,sum+candidates[i],target, candidates, sol, res);
         sol.remove(sol.size()-1);
      }
    }
  }
  public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
      Arrays.sort(candidates);  // sort the array first  
      ArrayList<Integer> sol = new ArrayList<Integer> ();
      ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
      helper (0,0,target,candidates,sol,res);
      return res;
  }
}
