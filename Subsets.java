public class Subsets{

  public void combination (int depth, int k, int[] num, ArrayList<Integer> sol, ArrayList<ArrayList<Integer>>  res){
    if (sol.size() == k){
      res.add(new ArrayList<Integer>(sol));
      return;
    }
    for (int i = depth; i < num.length; i ++){
      sol.add(num[i]);
      combination (i+1, k,num,sol,res);
      sol.remove(sol.size() - 1);
    }
  }

  public ArrayList<ArrayList<Integer>> subsets(int[] S) {
    Arrays.sort(S);
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> solution = new ArrayList<Integer>();
		// for all lengths of subsets
		for (int j = 0; j <= S.length; j ++){
		combination(0,j, num, solution, ret);
		}
		return ret;  
  }
}
