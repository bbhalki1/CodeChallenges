import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long arr[] = new long[5];
        long sum = 0;
        for (int i=0; i < arr.length ;i++ ) {
        	long res = in.nextLong();
        	arr[i] = res;
        	sum = sum + res;
        	//System.out.println(sum);
         }

        //System.out.print(sum);
        Arrays.sort(arr);
        System.out.println((sum - arr[arr.length-1]) + " " + (sum - arr[0]));
    }
}
