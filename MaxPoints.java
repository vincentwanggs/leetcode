public class MaxPoints{
  public int maxPoints(Point[] points) {
    if (points.length == 1)
            return 1;
    // a map from the slope to number of points
    HashMap<Double,Integer> slope2counts = new HashMap<Double,Integer>();
    int maxCount = 0;
    
    for (int i = 0; i < points.length; i ++){
      slope2counts.clear();
      Point anchor = points[i];
      int samePoints = 0;
      int sameLineCounts = 1;
      
      for (int j = i +1; j < points.length; j ++){
        Point cur = points[j];
        int count = 0;
        
        if (cur.x == anchor.x && cur.y == anchor.y)
          samePoints ++;
        else{
          double slope = Double.MAX_VALUE;
          if (cur.x != anchor.x){
              if (cur.y == anchor.y)
                slope = 0.0;
              else 
                slope = (double)(cur.y-anchor.y)/(double)(cur.x-anchor.x);
          }
         if (!slope2counts.containsKey(slope))
          slope2counts.put(slope,1);
         slope2counts.put(slope,slope2counts.get(slope)+1);
         count = slope2counts.get(slope);
         if (count > sameLineCounts){
            sameLineCounts = count;
         }
        }
        
      }
      if (sameLineCounts + samePoints >maxCount)
        maxCount = sameLineCounts + samePoints;
    }
  return maxCount;
    }
}
