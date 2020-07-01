package wipro.com.class_and_objects;

public class Assignment2
{
	static Double powerInt(int num1,int num2)
	{
	    return Math.pow(num1,num2);
	}
	static Double powerDouble(double num1,double num2)
	{
	    return Math.pow(num1,num2);
	}
		public static void main(String[] args) 
		{
			Assignment2 m=new Assignment2();
		  System.out.println(Assignment2.powerInt(3,3));
		  System.out.println(Assignment2.powerDouble(85,3));
		}
}
