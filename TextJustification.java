public class TextJustification{
  public  ArrayList<String> fullJustify(String[] words, int L) {  
      ArrayList<String> ret = new ArrayList<String>();  
      int wordsLen = words.length;  
      int curWordIdx = 0;  
      
      while (curWordIdx < wordsLen){
      // process word by word
        int len = 0;
        int index = curWordIdx;
        while (index < wordsLen && len + words[index].length() <= L){
          len += words[index].length()+1;
          index ++;
        }
        if (index - curWordIdx == 1){
          // only one word can fit into this line
          String tmp = words[curWordIdx];
          tmp = addSpace(tmp, L-tmp.length());
          ret.add(tmp);
          curWordIdx = index;
          continue;
        }
        
        // now we process multiple words
        int wordCharLen =  len - (index - curWordIdx);  // number of chars from the words, index-curWordIdx is number of spaces
        int nSpace = index < wordsLen ? (L-wordCharLen)/(index - curWordIdx -1): 1;
        
        int remainSpace = index < wordsLen ? (L-wordCharLen)%(index - curWordIdx -1): (L-wordCharLen-(index-curWordIdx-1));
        
        String tmp = "";
        for (int i = curWordIdx; i < index - 1; i ++){
          tmp += words[i];
          tmp = addSpace(tmp, nSpace); 
          if (index < wordsLen && remainSpace > 0){
            tmp += " ";
            remainSpace --;
          }
        }
         tmp += words[probeWordIdx-1];  
        if(remainSpace > 0){       
          tmp = addSpace(tmp, remainSpace);  
        }  
        ret.add(tmp);  
        curWordIdx = index;  
      }
      return ret;
  }
  public  String addSpace(String s, int count){  
        for(int i=1; i<=count; i++){  
            s += " ";  
        }  
        return s;  
    }  
}
