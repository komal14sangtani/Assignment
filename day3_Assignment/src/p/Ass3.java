package p;

public class Ass3 {
	

	

		public static void main(String[] args) {

			UserRegisteration registration=new UserRegisteration();
			
			try {
				registration.registerUser("raj", "usa");
			} catch (InvalidCountryException e) {
				System.out.println(e.getMessage());
			}
		}
	}


