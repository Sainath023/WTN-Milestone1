package wipro.com.Arrays;

public class Assignment14
{
	public static void main(String[] args) {
		if (args.length != 9)
			System.out.println("Please enter 9 integer numbers");

		int arr[][] = new int[3][3];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Integer.parseInt(args[x++]);
			}
		}
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				max = arr[i][j] > max ? arr[i][j] : max;
			}
		}
		
		System.out.println("The biggest number in the given array is " + max);
		
	}
}
