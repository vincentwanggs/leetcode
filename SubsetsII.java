public class SubsetII{
public void combination (int depth, int k, int[] num, ArrayList<Integer> sol, ArrayList<ArrayList<Integer>>  res){
    if (sol.size() == k){
      if (!res.contains(sol))
        res.add(new ArrayList<Integer>(sol));
      return;
    }
    for (int i = depth; i < num.length; i ++){
      sol.add(num[i]);
      combination (i+1, k,num,sol,res);
      sol.remove(sol.size() - 1);
    }
  }

  ArrayList<ArrayList<Integer>> subsetsWithDup(int[] S) {
    Arrays.sort(S);
		ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> solution = new ArrayList<Integer>();
		// for all lengths of subsets
		for (int j = 0; j <= S.length; j ++){
		combination(0,j, S, solution, ret);
		}
		return ret;  
  }
}
