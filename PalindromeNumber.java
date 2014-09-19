public class PalindromeNumber{
   public boolean isPalindrome(int x) {
      if (x < 0)
        return false;
      
      int sum = 0;
      while (num != 0){
        int digit = num%10;
        num = num/10;
        sum = sum*10 + digit;
      }
      
      if (sum == x)
        return true;
      else
        return false;
      
   }
}
