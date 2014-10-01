public class LongestPalindromeSubstring{

   public String longestPalindrome(String s) {
      boolean[][] palindrome = new boolean[s.length()][s.length()];
      
        int begin = 0;
        int end = 0;
        int max = 0;
        for (int i =  s.length() -1 ; i >=0; i --){
            for (int j = i; j <= s.length() - 1; j ++){
                if ((s.charAt(i) == s.charAt(j)) && ((j-i)< 2  || palindrome[i+1][j-1])){
                    palindrome[i][j] = true;
                    if (j - i > max){
                        max = j - i;
                        begin = i; end = j;
                    }
                }
            }
        }
        
        return s.substring(begin,end+1);  
   }

}
