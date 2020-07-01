package wipro.com.Arrays;

public class Assignment11 
{
	public static void main(String[] args)
	{
	    int n=0,c=0;
		int a[]={1,4,1,4};
		n=a.length;
		for(int i=0;i<n;i++)
		{
		    if((a[i]==1)||(a[i]==4))
		    {
		        c++;
		    }
		}
		if(c==n)
		{
		    System.out.print("true");
		}
		else
		{
           System.out.print("false");
		}
	}
}
