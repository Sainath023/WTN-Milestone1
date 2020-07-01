package wipro.com.Flowcontrol;

public class Assignment1_1
{
	public static void main(String args[])
	{
	int a,b,c,d;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=a%10;
	d=b%10;

	if(c==d)
	{
	System.out.println("True");
	}
	else
	{
	System.out.println("False");
	}
	}
}
