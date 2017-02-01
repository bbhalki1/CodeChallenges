import java.util.*;
 
public class WaveArray{
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(4);
		// for (int i=0;i<ar.length-1 ;i += 2 ) {
		// 		swap(ar,i,i+1);
		// 	}
		// for (int i : ar) {
		// 	System.out.print(i);
		// }
		Collections.sort(a);
		for (int i=0;i<a.size()-1 ;i+=2 ) {
			swap(a,i,i+1);
		}
		for (int i : a) {
			System.out.print(i);
		}
	}
		

	public static void swap(ArrayList<Integer> al, int a, int b)
    	{
	        // int temp = arr[a];
	        // arr[a] = arr[b];
	        // arr[b] = temp;
	        Collections.swap(al,a,b);
    	}
}
