//Given two sorted integer arrays A and B, merge B into A as one sorted array.

public class MergeSortedArray{

  public void merge(int A[], int m, int B[], int n) {
      
       int end = m + n-1;
      int indexA = m-1;
      int indexB = n -1;
      while (indexB >= 0 && indexA >= 0){
        if (A[indexA] > B[indexB]){
          A[end] = A[indexA];
          indexA --;
        }
        else{
          A[end] = B[indexB];
          indexB --;
        }
        end --;
      }
     while (indexB >= 0)
        A[end --] = B[indexB--];
        
    }
}
