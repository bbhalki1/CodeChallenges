import java.util.*;

public class MonkAndWelcome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i=0; i<n ; i++ ) {
			a[i] = sc.nextInt();
		}
		for (int j=0; j<n ; j++ ) {
			b[j] = sc.nextInt();
		}
		for (int k =0; k<n ; k++) {
			System.out.print(a[k] + b[k]);
		}
	}
}
