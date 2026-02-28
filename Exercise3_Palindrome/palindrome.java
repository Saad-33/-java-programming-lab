package oops;
import java.util.Scanner;
public class palindrome {
static long factorialIterative(int n) {
	if (n<0) throw new IllegalArgumentException("Negetive not Allowed");
	long result =1;
	for (int i=2;i<=n;i++) result *=i;
	return result;
}
static long factorialRecursive(int n) {
	if (n<0) throw new IllegalArgumentException("Negetive not Allowed");
	return (n<=1)?1:n* factorialRecursive(n-1);
}
static boolean isPalindrome(String s) {
	String clean=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
	int i=0, j=clean.length()-1;
	while(i<j) {
		if (clean.charAt(i)!=clean.charAt(j)) return false;
		i++;
		j--;
	}
	return true;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string to test palindrome:");
	String input = sc.nextLine();
	System.out.println("Is palindrome ?"+ isPalindrome(input));
	System.out.println("Enter a non-Negetive integer for factorial:");
	int n =sc.nextInt();
	System.out.println("Iterative factorial:" +factorialIterative(n));
	System.out.println("Recursive factorial:" +factorialRecursive(n)); 
	System.out.println("2462618");
	sc.close();
}
}
