import java.io.*;
import java.utils.*;

// Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

public class UniqueBSTs{

    public int numTrees(int n) {
      if (n == 1 || n == 0)
        return 1;
      int sum = 0;
      // the number of trees with root value of i is computed as the product of the number of elements smaller than i and the number
      // of elements larger than i and smaller than n
      
      // divide and conquer
      for (int i = n; i > 0; i --){
        sum += numTrees(i-1) * numTrees(n-i);
      }
      return sum;
    }

}
