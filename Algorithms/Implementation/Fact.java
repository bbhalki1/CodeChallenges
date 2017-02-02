import java.util.*;

public class Fact{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val = factorial(num);
		System.out.print(val);
	}

	public static int factorial(int num){
		if (num <= 1) {
			return 1;
		}else{
			return (num * factorial(num-1));
		}
	}
}