package wipro.com.Exception_Handling;

public class InvalidCountryException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}

}
