public class PalindromePartitionII{
  public int minCut(String s) {
      // whether substring i to j is palindrome
      boolean[][] isPalindrome = new boolean[s.length()][s.length()];  
      
      // the number of cuts needed for the substring(i,end) to be palindrome
      int[] cuts = new int[s.length() + 1];
      for (int i = s.length(); i >= 0; i --)
        cuts[i] = s.length() - i;
        
      for (int i = s.length()-1; i >= 0; i --){
      // find all positions after i till the end to get the min cuts
        for (int j = i; j < s.length(); j ++){
          if (s.charAt(i) == s.charAt(j) && ((j-i)<2 || isPalindrome[i+1][j-1])){
            isPalindrome[i][j] = true;
            cuts[i] = Math.min(cuts[i], cuts[j+1]+1);
          }
        }
      }
      return cuts[0]-1;
  }
}
