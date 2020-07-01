package wipro.com.Arrays;

public class Assignment12
{
	public static void main(String[] args)
	{
	    int n=0,d,e;
		int a[]={1,2,3};
		int b[]={4,5,6};
		int c[]=new int[2];
        d=a[a.length/2];
        e=b[b.length/2];
        c[0]=d;
        c[1]=e;
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
	}
}
