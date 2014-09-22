public class GasStation{
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int cur = 0;
    int start = 0;
    int remainSoFar = 0;
    int totalRemain = 0;
    while (cur < gas.length){
      if (remainSoFar + gas[cur] -cost[cur] < 0){
        start = cur + 1;
        remainSoFar = 0;
      }
      else{
        remainSoFar += gas[cur] -cost[cur];
    }
   
    totalRemain += gas[cur] -cost[cur];
     cur ++;
  }
  
  return (totalRemain >= 0)?start:-1;
}
