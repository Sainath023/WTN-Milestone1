package wipro.com.Flowcontrol;

public class Assignment13
{
	public static void main(String args[])
	{
	int l=10,h=99;
	while(l<h)
	{
	int flag=0;
	for(int i=2;i<=l/2;i++)
	{
	if(l%i==0)
	{
	flag=1;
	break;
	}
	}
	if(flag==0 && l!=0 && l!=1)
	{
	System.out.println(l+" ");
	}
	++l;
	}

	}
}
