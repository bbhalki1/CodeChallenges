import java.util.*;

public class MinMaxDivideConquer{
	
	public static void main(String[] args) {
		int[] arr = {4, 3, 5, 1, 2, 6, 9, 2, 10, 11, 12};
  		MinMax result = findMinMaxRecursive(arr, 0, arr.length - 1);
  		System.out.println("maximum= " + result.max);
  		System.out.println("minimum= " + result.min);	
	
	}

	public static MinMax findMinMaxRecursive(int arr[], int i, int j){
		if (i>j) {
			return null;
		}
		if (i == j) {
			return new MinMax(arr[i],arr[j]);
		}
		else{
			MinMax left;
			MinMax right;
			left = findMinMaxRecursive(arr, i, (i + j) / 2);
			right = findMinMaxRecursive(arr, (i+j) /2 +1 ,j);
			if (left==null)
				return right;
			else if (right==null)
				return left;
			else{
				return new MinMax(Math.min(left.min,right.min),Math.max(left.max,right.max));
			}
		}
	}
}

class MinMax{
	public int min;
	public int max;

	public MinMax(int min,int max){
		this.min = min;
		this.max = max;
	}
}