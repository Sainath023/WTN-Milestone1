package wipro.com.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the arrays");
			int n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the elements in the array: ");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println("Enter the index");
			int in = sc.nextInt();
			System.out.println("The array element at index " + in + " = " + a[in]);
			System.out.println("The array element successfully accessed");
			sc.close();
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} 
		catch (InputMismatchException ie) {
			System.out.println("java.util.InputMismatchException");
		}
		
	}

}
