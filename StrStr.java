public class StrStr{
 // Returns a pointer to the first occurrence of needle in haystack
  public String strStr(String haystack, String needle) {
    if (needle.length() > haystack.length())
      return null;
      if (needle.equals(haystack))
        return needle;
    for (int i = 0; i < haystack.length() - needle.length(); i ++){
       String temp = haystack.substring(i,needle.length()+i);
       if (temp.equals(needle))
                return haystack.substring(i);
    }
    return null;
  }
}
