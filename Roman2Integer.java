public class Roman2Integer{
  
  // convert a roman number in char to int
  public int r2i(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X':return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    
    public int romanToInt(String s) {
    
      for (int i = 0; i < s.length()-1; i ++){
      
        char cur = s.charAt(i);
        char next = s.charAt(i+1);
        if (r2i(cur) >= r2i(next)){
          res += r2i(cur);
        }
        else{
          res += r2i(next) - r2i(cur);
          i ++;
        }
    }
    if (i == s.length()-1)
            res += r2i(s.charAt(i));
    return res;
}
