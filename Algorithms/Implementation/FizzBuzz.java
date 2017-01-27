import java.util.*;

public class FizzBuzz{
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fb.calculateFizzBuzz(n);
	}

	public void calculateFizzBuzz(int n){
		for (int i =0 ; i < n ; i++) {
		if ((n % 3 == 0 ) && (n%5 == 0)) {
			System.out.print("FizzBuzz");
		}
		else if (n %3 == 0) {
			System.out.print("Fizz");
		}
		else if (n % 5 == 0){
			System.out.print("Buzz");
		}
		else{
			System.out.print(n);
		}	
		}
		
	}
}