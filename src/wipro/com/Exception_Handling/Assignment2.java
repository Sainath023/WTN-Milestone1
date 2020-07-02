package wipro.com.Exception_Handling;

import java.util.InputMismatchException;

public class Assignment2
{
	public static void main(String[] args) {
		try {
			int[] a=new int[args.length];
			int sum=0;
			int avg=0;
			for(int i=0;i<args.length;i++) {
				a[i]=Integer.parseInt(args[i]);
				sum+=a[i];
			}
			avg=sum/args.length;
			System.out.println("Sum is "+sum);
			System.out.println("Average is "+avg);
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} 
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
	}
}
