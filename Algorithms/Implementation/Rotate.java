import java.util.*;

public class Rotate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		Rotate r = new Rotate();
		ArrayList<Integer> arr1 = r.getRotate(arr,b);
		System.out.print(arr1);
	}

	public ArrayList<Integer> getRotate(ArrayList<Integer> A, int B){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			//System.out.print(A.size());
			ret.add(A.get((i + B) % A.size()));
		}
		return ret;
	}
}