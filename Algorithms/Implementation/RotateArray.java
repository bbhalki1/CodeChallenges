import java.util.*;

public class RotateArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int newArray[][] = new int[n][m];
		for (int i =0; i< m ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				a[i][j] = sc.nextInt();
			}
		}
		rotate(a);

		// for(int x=0; x<a[0].length; x++){
  //       	for(int y=a.length-1; y>=0; y--){
  //           newArray[x][y] = a[y][x];
	 //        }
  //   	}

  //   	for (int c =0;c<newArray.length ;c++ ) {
  //   		for (int b =0; b<newArray.length ;b++ ) {
  //   			System.out.print(newArray[c][b]);
  //   		}
  //   	}
	}

	public static void rotate(int[][] matrix) {
	int n = matrix.length;
	//System.out.print(n);
	for (int i = 0; i < n / 2; i++) {
		for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[n-1-j][i];
			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
			matrix[j][n-1-i] = temp;
		}
	}
	    	for (int c =0;c<matrix.length ;c++ ) {
    		for (int b =0; b<matrix.length ;b++ ) {
    			System.out.print(matrix[c][b]);
    		}
    	}
	}
}