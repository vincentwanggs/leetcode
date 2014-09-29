public class ZigZagConversion{
  public String convert(String s, int nRows) {
    
    if (nRows == 1 || nRows >= s.length())
            return s;
       int len = s.length();
    int groups = len/(2*nRows-2);
    
    int elementsPerGroup = 2*nRows - 2;
    
    StringBuffer res = new StringBuffer();
    
    // the first line
    int start = 0;
    while (start < s.length()){
      res.append(s.charAt(start));
      start += 2*nRows - 2;
    }
    // second to (n - 1) line
    
    int increase = 2*nRows-4;
    for (int row = 1; row < nRows - 1; row ++){
      start = row;
      res.append(s.charAt(start));
      while (start < s.length()){
        start += increase;
        if (start < s.length()) res.append(s.charAt(start));
        start += (2*nRows-2) - increase;
        if (start < s.length()) res.append(s.charAt(start));
      }
      increase -= 2;
    }
    
    // now the last row
    start = nRows-1;
    while (start < s.length()){
      res.append(s.charAt(start));
      start += 2*nRows - 2;
    }
    
    return res.toString();
  }
}
