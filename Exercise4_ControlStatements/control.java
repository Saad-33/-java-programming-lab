package oops;
import java.util.Scanner;
public class control {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an integer:");
		int n = sc.nextInt();
		if (n<0) {
			System.out.println("Negetive");
		} else if (n==0) {
			System.out.println("Zero");
		}else {
			System.out.println("Positive");
		}
		if (n%2==0) {
			System.out.println("It is even");
		}else {
			System.out.println("It is odd");
		}
		System.out.println("2462618");
		int day =n % 7 + 1;
		switch(day) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6 -> System.out.println("Saturday");
			default -> System.out.println("Sunday");
		}
		sc.close();
	}

	
}
