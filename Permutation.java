public class Permutation{

  public void swap(int[] num, int i, int j){
    int tmp = num[i];
    num[i] = num[j];
    num[j] = tmp;
  }
  public void helper(int depth, int[] num, ArrayList<ArrayList<Integer>> res){
  
    if (depth == num.length){
      ArrayList<Integer> sol = new ArrayList<Integer>();
      for (int i  = 0; i < num.length; i ++)
        sol.add(num[i]);
      res.add(sol);
      return;
    }
    
    for (int i = depth; i < num.length; i ++){
      // swap num[depth] with every element that comes after it in the array
      swap(num,i,depth);
      
      helper(depth + 1,num,res);
      // swap back
      swap(num, i,depth);
    }
  }
  public ArrayList<ArrayList<Integer>> permute(int[] num) {
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 		helper(0, num, result);
	 		return result;  
  }
}
