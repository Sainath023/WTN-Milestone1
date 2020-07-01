package wipro.com.Arrays;

public class Assignment1
{
	public static void main(String args[])
	{
	int a[] = new int [] {10,20,30,40,50};  
	        int sum = 0,n;  
	        float avg;
	        n=a.length;
	        for (int i = 0; i < a.length; i++) 
	        {  
	           sum = sum + a[i];  
	        }  
	        avg=(float)sum/n;
	        System.out.println("Sum  " + sum);  
	        System.out.println("Average "+avg);
	}
}
