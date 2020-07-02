package wipro.com.Exception_Handling;

import java.util.Scanner;

class NegativeValuesException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeValuesException(String s) {
		super(s);
		System.out.println(s);
	}
}
class ValuesOutOfRangeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	public ValuesOutOfRangeException() {
//		super();
//		System.out.println("ValuesOutOfRangeException occured");
//	}
}

public class Assignment3 {
	public static void main(String[] args) {
//		Exception ne1=new NegativeValuesException("NegativeValuesException occured");
//		Exception ve1=new ValuesOutOfRangeException();
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter sudent1 marks in 3 subjects ");
			int s1a,s1b,s1c,s2a,s2b,s2c,avg1,avg2;
			s1a=sc.nextInt();
			s1b=sc.nextInt();
			s1c=sc.nextInt();
			System.out.println("enter sudent2 marks in 3 subjects ");
			s2a=sc.nextInt();
			s2b=sc.nextInt();
			s2c=sc.nextInt();
			sc.close();
			if(s1a<0) throw new NegativeValuesException("NegativeValuesException occured");
			if(s1b<0) throw new NegativeValuesException("NegativeValuesException occured");
			if(s1c<0) throw new NegativeValuesException("NegativeValuesException occured");
			if(s2a<0) throw new NegativeValuesException("NegativeValuesException occured");
			if(s2b<0) throw new NegativeValuesException("NegativeValuesException occured");
			if(s2c<0) throw new NegativeValuesException("NegativeValuesException occured");
			if(s1a>100) throw new ValuesOutOfRangeException();
			if(s1b>100) throw new ValuesOutOfRangeException();
			if(s1c>100) throw new ValuesOutOfRangeException();
			if(s2a>100) throw new ValuesOutOfRangeException();
			if(s2b>100) throw new ValuesOutOfRangeException();
			if(s2c>100) throw new ValuesOutOfRangeException();
			avg1=(s1a+s1b+s1c)/3;
			avg2=(s2a+s2b+s2c)/3;
			System.out.println("Average of two students is "+avg1+" and "+avg2);
		}
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} 
		catch (NegativeValuesException ne) {
			System.out.println(ne.getMessage());
		} 
		catch (ValuesOutOfRangeException ve) {
//			System.out.println(ve.getMessage());
			System.out.println("ValuesOutOfRangeException occured");
		}
	}
}