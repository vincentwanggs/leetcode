public class TwoSum{

  public int[] twoSum(int[] numbers, int target) {
      HashMap<Integer, Integer> num2index =  new HashMap<Integer,Integer>();
      
      int[] res = new int[2];
      for (int i = 0; i < numbers.length; i ++){
        int num = numbers[i];
        if (num2index.containsKey(target - num)){
          res[0] = num2index.get(target-num);
          res[1] = i+1;
        }
        else{
          num2index.put(num,i+1);
      }
  }
  return res;
}
