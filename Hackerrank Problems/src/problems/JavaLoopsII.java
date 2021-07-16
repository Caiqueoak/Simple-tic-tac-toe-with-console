//https://www.hackerrank.com/challenges/java-loops/problem
package problems;
import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrRange = scan.nextInt();

		int[][] vector = new int[arrRange][3];

		//loop to gather the elements of the array
		for (int i = 0; i < arrRange; i++) {
			vector[i][0] = scan.nextInt();
			vector[i][1] = scan.nextInt();
			vector[i][2] = scan.nextInt();	
		}
		//loop to apply the values of the array in the equation
		for (int m = 0; m < arrRange; m++) {
			int a = vector[m][0];
			int n = 0;
			
			for (; n <= vector[m][2]; n++) {
				if (n < vector[m][2]) {
				a += vector[m][1] * Math.pow(2,n);
				System.out.print(a + " ");
				}
				else if (n == vector[m][2]) {
					System.out.println("");
				}
			}
		}
	}
}
