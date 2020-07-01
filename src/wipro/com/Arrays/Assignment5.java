package wipro.com.Arrays;

public class Assignment5
{
	public static void main(String args[])
	{
	int a[] ={65, 120, 98,56,44};  
	        int n=0,t;  
	        n=a.length;
	        for (int i=0;i<n;i++) 
	        {  
	         for(int j=i+1;j<n;j++)
	         {
	             if(a[i]>a[j])
	             {
	                 t=a[i];
	                 a[i]=a[j];
	                 a[j]=t;
	             }
	         }
	               
	        }
	        
	System.out.println("First samll value "+a[0]);
	System.out.println("Second samll value "+a[1]);
	System.out.println("First largest value "+a[n-1]);
	System.out.println("Second largest value "+a[n-2]);

	}
}
