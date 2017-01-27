import java.util.*;

public class SprialMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int [m][n];
		for (int i=0;i<m;i++ ) {
			for (int j=0;j<n ;j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}
		// for (int i=0;i<m;i++ ) {
		// 	for (int j=0;j<n ;j++ ) {
		// 		System.out.print(arr[i][j]);
		// 	}
		// }
		int t=0,b=m-1,l=0,r=n-1;
		int dir =0;
		while (t <= b && l <= r) {
			if (dir == 0) {
				for (int k = l; k <=r ; k++) {
					System.out.print(arr[t][k]);
				}
				t++;
			}
			else if (dir == 1) {
				for(int k = t;k<=b; k++){
					System.out.print(arr[k][r]);
				}
				r--;
			}
			else if (dir == 2) {
				for (int k = r ; k >=l ; k-- ) {
					System.out.print(arr[b][k]);
				}
				b--;
			}
			else if (dir == 3) {
				for (int k = b; k >= t ; k--) {
					System.out.print(arr[k][l]);
				}	
				l++;
			}
			dir = (dir+1) % 4;
		}
	}
}	