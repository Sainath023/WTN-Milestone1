package wipro.com.Flowcontrol;

public class Assignment17
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
	if(n==c)
	{
	System.out.println(c+" is a palindrome");
	}
	else
	{
	System.out.println(c+" is not a palindrome");
	}
	}
}
