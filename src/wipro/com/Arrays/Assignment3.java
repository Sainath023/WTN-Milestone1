package wipro.com.Arrays;

public class Assignment3
{
	public static void main(String args[])
	{
	int a[] = new int [] {1,4,34,56,7};  
	        int n=0;
			int k,flag=0;  
	        n=a.length;
	        k=Integer.parseInt(args[0]);
	        for (int i = 0; i < a.length; i++) 
	        {  
	           if(a[i]==k)
	           {
	               System.out.println("Index Value is "+i);
	               flag=1;
	               break;
	               
	           }
	        }
	           if(flag==0)
	           {
	               System.out.println(-1);
	           }


	}
}
