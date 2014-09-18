public class Combinations{

  public void helper(int depth, int n, int k, ArrayList<Integer> sol, ArrayList<ArrayList<Integer>>  res){
    if (sol.size() == k){
      res.add(new ArrayList<Integer> (sol));
      return;
    }
    for (int i = depth; i <= n; i ++){
      sol.add(i);
      helper(i+1, n, k, sol, res);
      sol.remove(sol.size() - 1);
    }
  }

  public ArrayList<ArrayList<Integer>> combine(int n, int k) {
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
	    ArrayList<Integer> solution = new ArrayList<Integer>();
	    helper(1, n,k,solution, result);
	    return result; 
  }
}
