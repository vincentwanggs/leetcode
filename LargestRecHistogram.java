public class LargestRecHistogram{
   public int largestRectangleArea(int[] height) {  
   
   // observation, for each hight, the left boundary is the leftmost height with greater or equal height
   // the right boundary is the rightmost height with greater or equal height
   int cur = 0, area = 0;
   
      while (cur < height.length){
        if (left.empty() || height[cur] >= height[left.peek()]){
          left.push(cur);
          cur ++;
        }
        else{// we get a right boundary
          int top = left.pop();
          // compute the area
          area = Math.max(area, height[top]*(left.isEmpty() ? cur : (cur-left.peek()-1)));  
        }
      }
   
   // we need to handle the remaining elements in left
    while (!left.empty()){
        int top = left.pop();  
        area = Math.max(area, height[top]*(left.isEmpty() ? cur : (cur-left.peek()-1)));  
    }
    
    return area;
   }
}
