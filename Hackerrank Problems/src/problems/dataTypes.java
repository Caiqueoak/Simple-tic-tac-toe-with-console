//https://www.hackerrank.com/challenges/java-datatypes/problem
package problems;
import java.util.Scanner;

public class dataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] arr = new String[t];

        for (int i = 0; i < t; i++){
            try{
            arr[i] = scan.next();
            
	            if(Long.parseLong(arr[i]) >= -128 & Long.parseLong(arr[i]) <= 127){
	            	System.out.format(arr[i] + " can be fitted in:%n" + "* byte%n" + "* short%n" + "* int%n" + "* long%n");
	            }
	            else if(Long.parseLong(arr[i]) >= -32768 & Long.parseLong(arr[i]) <= 32767){
	            	System.out.format(arr[i] + " can be fitted in:%n" + "* short%n" + "* int%n" + "* long%n");
	            }   
	            else if(Long.parseLong(arr[i]) >= -2147483648 & Long.parseLong(arr[i]) <= 2147483647){
	            	System.out.format(arr[i] + " can be fitted in:%n" + "* int%n" + "* long%n");
	            }
	            else if(Long.parseLong(arr[i]) >= -9223372036854775808L & Long.parseLong(arr[i]) <= 9223372036854775807L){
	            	System.out.format(arr[i] + " can be fitted in:%n" + "* long%n");
	            }
            }catch (Exception e) {
            	System.out.println(arr[i] + " can't be fitted anywhere.");
            }
            
        }

	}

}
