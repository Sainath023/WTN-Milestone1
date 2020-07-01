package wipro.com.Arrays;

public class Assignment2 
{
	public static void main(String args[])
	{
        int max=0,min=0;
        int n=0;  
	    int a[] = new int [] {10,20,-30,430,50};   
	        n=a.length;
	       max=a[0];
	        for (int i = 0; i < a.length; i++) 
	        {  
	           if(a[i]>max)
	            {
	               max=a[i];
	            }
	        }  
	       min=a[0];
	        for (int i = 0; i < a.length; i++) 
	        {  
	           if(a[i]<min)
	            {
	               min=a[i];
	            }
	        }  
	System.out.println("Maxmimum Value "+max);
	System.out.println("Minimum Value "+min);


	}
}
