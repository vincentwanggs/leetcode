import java.io.*;
import java.utils.*;

//Given an array of integers, every element appears three times except for one. Find that single one.

public class SingleNumberII{
   public int singleNumber(int[] A) {
      int[] bitArray = new int[3]; // an bit array with length 3 to store the bits that have been appear 1, 2 and 3 times.
                                  // we use index 0 to store the bits that have been appear 3 times
      bitArray[0] = ~0;     // intialisation to be all 1's
      for (int i = 0; i < A.length; i ++){
        int t = bitArray[2];  
        for (int j = 2; j > 0; j --){
          bitArray[j]  = (bitArray[j-1] & A[i]) | (bitArray[j] & ~A[i]);
        }
        bitArray[0] = (t & A[i]) | (bitArray[0] & ~A[i]);
      }
      
      return bitArray[1];
    }
}
