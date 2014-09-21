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
      
     
      // count the consecutive number of elements
      StringBuffer cur = new StringBuffer("1");
      
      for (int i = 1; i <= n; i ++){
        StringBuffer res = new StringBuffer();
        String str = cur.toString();
        char ch = str.charAt(0);
        int count = 0;
        for (int j = 0; j < str.length(); j ++){
          char ch1 = str.charAt(j);
            while (j < str.length() && ch1 == ch){
              ch1 = str.charAt(j);
              count ++;
            }
            res.append(count);
            res.append(ch);
            if (j < str.length())
              ch = str.charAt(j);
            count = 0;
        }
        cur = res;
      }
     return  res;
    }
}
