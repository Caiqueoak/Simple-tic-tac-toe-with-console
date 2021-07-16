//https://www.hackerrank.com/challenges/java-loops-i/problem
package problems;
import java.util.Scanner;

public class JavaLoopsI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i >= 1 & i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}

	}

}
