public class WordLadder{
  public int ladderLength(String start, String end, Set<String> dict) {
  // BFS to get the shortest distance, store the intermedia results
      ArrayList<String> queue = new ArrayList<String>();
      ArrayList<Integer> distance = new ArrayList<Integer>();
      queue.add(start);
      distance.add(1);  
      
      while (queue.size() > 0){
        
        String cur = queue.get(0);
        queue.remove(0);
        int curDist = distance.remove(0);
        if (cur.equals(end)){
          return curDist;
        }
        // flip every char of s
        for (int i = 0; i < start.length(); i ++){
          
          for (int j = 0; j < 26; j ++){
            StringBuffer tmp = new StringBuffer(cur);
            tmp.setCharAt(i,(char)(j+'a'));
            if (dict.contains(tmp)){
              queue.add(tmp);
              distance.add(curDist + 1);
              
            }
          }
        }
        
      }
      return 0;
  }
}
