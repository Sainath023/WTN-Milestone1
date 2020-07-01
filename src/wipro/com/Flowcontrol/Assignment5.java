package wipro.com.Flowcontrol;

public class Assignment5
{
	public static void main(String args[])
	{
	String str=args[0];
	char ch=str.charAt(0);
	if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	{
	System.out.println("Alphabhet");
	}
	else if(ch>='0'&&ch<='9')
	{
	System.out.println("Number");
	}
	else
	{
	System.out.println("Special Character");
	}
	}
}
