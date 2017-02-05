import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int applePos = 0;
        int orangePos =0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int pos = (apple[apple_i] + a);
            if (pos >= s && pos <= t) applePos++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int posVal = (orange[orange_i] + b);
            if(posVal >= s && posVal <= t) orangePos++;
        }
        System.out.println(applePos);
        System.out.println(orangePos);
    }
}
