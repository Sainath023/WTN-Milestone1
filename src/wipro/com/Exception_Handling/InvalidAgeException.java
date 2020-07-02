package wipro.com.Exception_Handling;

public class InvalidAgeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age ");
	}
}
