package wipro.com.Exception_Handling;

public class UserRegistration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}
	
	public static void main(String[] args) {
		UserRegistration reg = new UserRegistration();
		
		try {
			reg.registerUser("Jhon", "USA");
			//registration.registerUser("Mini", "India");
		} catch (InvalidCountryException e) {
			System.out.println(e);
		}
	}
}
