package wipro.com.Flowcontrol;

public class Assignment16 
{
	public static void main(String args[])
	{
	int n,t,r,c=0;
	n=Integer.parseInt(args[0]);
	t=n;
	while(t>0)
	{
	r=t%10;
	c=c*10+r;
	t/=10;
	}
	System.out.println(c);
	}
}
