package wipro.com.Flowcontrol;

public class Assignment12 
{
	public static void main(String args[])
	{
	int n,m,flag=0;
	n=Integer.parseInt(args[0]);
	m=n/2;
	if(n==0||n==1)
	{
	System.out.println(n+" It is a not prime number");
	}
	else
	{
	for(int i=2;i<=m;i++)
	{
	if(n%i==0)
	{
	System.out.println(n+" It is a not prime number");
	flag=1;
	break;
	}
	}
	}
	if(flag==0)
	{
	System.out.println(n+" It is a prime number");
	}











	}
}
