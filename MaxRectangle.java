public class Solution {
    public int maxRecHist(int[] height){
    // get the maximum rectange in a histogram
    Stack<Integer> left = new Stack<Integer>();
    int cur = 0, area = 0;
    while (cur < height.length){
      if (left.empty() || height[cur] >= height[left.peek()]){
        left.push(cur);
        cur ++;
      }
      else{
        int top = left.pop();
        area = Math.max(area, height[top]* (left.empty() ? cur: (cur -left.peek()-1 )));
      }
    }
    while (!left.empty()){
       int top = left.pop();
        area = Math.max(area, height[top]* (left.empty() ? cur: (cur -left.peek()-1 )));
    }
    return area;
  }
  public int maximalRectangle(char[][] matrix) {
      if(matrix==null || matrix.length==0 || matrix[0].length==0)
        {
        return 0;
    }
      int[] height = new int[matrix[0].length];
      int maxArea = 0;
      for (int i = 0; i < matrix.length; i ++){
          for (int j = 0; j < matrix[0].length; j ++){
              if (matrix[i][j] == '1'){
                  height[j] = height[j] + 1;
              }
              
          // process one line
          maxArea = Math.max(maxArea,maxRecHist(height));
      }
      return maxArea;
  }
}
