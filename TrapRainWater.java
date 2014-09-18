public class TrapRainWater{
	public int trap(int[] A){
	
	// find the leftmost position where water can be collected
	int left = 0;
	
	while (left < A.length-1 && A[left] <= A[left + 1]){
			left ++;
	}
	int tail = left + 1; // the tail of the current valid water interval
	
	int right = A.length - 1;
	// find the rightmost position where water can be collected
	while (right > 0 && A[right] <= A[right - 1]){
		right --;
	}
	
	
	int sum = 0;
	int vol = 0;
	// tail > left
	while (tail < A.length){
		if (A[tail] < A[left]){
			// still can collect water
			sum += A[tail];
		}
		else{
			// no longer can collect water in this interval, so update the volumn
			vol += (tail - left - 1)*Math.min(A[left],A[tail]) - sum;
			sum = 0;
			left = tail;
		}
		tail ++;
	}
	
	// now all the water before "left" have been collected
	sum = 0;
	// collect from right to left, right is the first position where we can collect water from right to left
	tail = right - 1;
	// starting from A[right], we begin to collect water from right to left, where tail is the left boundary
	// where right > tail
	while ( right > left){
		if (A[tail] < A[right]){
			sum += A[tail];
		}
		else{
			vol += (right - tail - 1)*Math.min(A[tail],A[right]) - sum;
			right = tail;
			sum = 0;
		}
		tail --;
	}
	return vol;
	}
}
