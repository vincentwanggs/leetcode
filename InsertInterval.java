public class InsertInterval{

  
  public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
      int start = newInterval.start;
      int end = newInterval.end;
      
      if (intervals.size() == 0){
          intervals.add(newInterval);
          return intervals;
      }
      // find the insertion position
      int i = 0;
      for (i = 0; i < intervals.size(); i ++){
        Interval intv = intervals.get(i);
        if (start <= intv.start){
          intervals.add(i,newInterval);
          break;
        }
      }
      //  now we need to merge the intervals of they are overlapping
      if (i == intervals.size()){
        intervals.add(newInterval);
      }
      
      Interval cur = intervals.get(0);
      for (i = 1; i < intervals.size(); i ++){
        Interval intv = intervals.get(i);
        if (intv.start <= cur.end){
          intervals.set (i, new Interval (Math.min(intv.start, cur.start), Math.max(intv.end, cur.end)));
          intervals.remove(cur);
          i --;
        }
        cur = intervals.get(i);
      }
      return intervals;
        
  }
}
