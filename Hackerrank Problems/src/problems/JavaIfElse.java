//https://www.hackerrank.com/challenges/java-if-else/problem
package problems;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n % 2 == 1) {
			
			System.out.print("Weird");
		}
		else if ((n >= 2 & n <= 5) & n % 2 == 0) {
			
			System.out.print("Not Weird");
		}
		else if ((n >= 6 & n <= 20) & n % 2 == 0) {
			
			System.out.print("Weird");
		}
		else if (n > 20 & n % 2 == 0) {
			
			System.out.print("Not Weird");
		}

	}

}
