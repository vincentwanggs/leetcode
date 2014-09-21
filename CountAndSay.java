public class CountAndSay{
/*
      The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
      */  
      
  public String countAndSay(int n) {
      
     
      StringBuffer cur = new StringBuffer("1");
      if (n == 1)
            return cur.toString();
      StringBuffer res = new StringBuffer();
      for (int i = 2; i <= n; i ++){
        res = new StringBuffer();
        String str = cur.toString();
        int count = 0;
        // for all the chars of the current solution
        for (int j = 0; j < str.length(); j ++){
          char ch = str.charAt(j);
          // count how many times ch appears in the current solution
          while (j < str.length() && ch == str.charAt(j)){
              j ++;
              count ++;
          }
            res.append(count);
            res.append(ch);
          if (j == str.length())
            break;
          count = 0;
          j --;
        }
        cur = res;
      }
     return  res.toString();
    }
}
