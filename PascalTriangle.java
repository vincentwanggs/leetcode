public class PascalTriangle{

/*
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
*/
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>> ();
        if (numRows == 0)
            return triangle;
         ArrayList<Integer> elems = new ArrayList<Integer> ();
         elems.add(1);
         triangle.add(elems);
         
        for (int i = 1; i < numRows; i ++){
          int numElem = i + 1;
          elems = new ArrayList<Integer> ();
          elems.add(1);
          for (int j = 1; j < numElem - 1; j ++){
            int elem = triangle.get(i-1).get(j-1) +  triangle.get(i-1).get(j);
            elems.add(elem);
          }
          elems.add(1);
          triangle.add(elems);
        }
        
        return triangle;
    }

}
