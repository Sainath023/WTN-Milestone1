package wipro.com.Flowcontrol;

public class Assignment3
{
	public static void main(String args[])
	{

	if(args.length==0)
	{
	System.out.print("No value");
	}
	else
	{
	for(int i=0;i<(args.length);i++)
	{
	System.out.println(args[i]);
	if(i<(args.length)-1)
	{
	System.out.print(" ,");
	}
	}
	}
	}
}
