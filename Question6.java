 package task11;
 
 public class Question6 extends RuntimeException {
	    public Question6(String message) {
	        super(message);
	    }
	}

	public class LoginSystem {
	    private static final String CORRECT_PASSWORD = "mySecretPassword";

	    public static void main(String[] args) {
	        try {
	            String userInputPassword = getUserInputPassword();
	            login(userInputPassword);
	        } catch (Question6 e) {
	            System.out.println("Login failed: " + e.getMessage());
	        }
	    }

	    public static String getUserInputPassword() {
	        // Simulate getting user input, e.g., from a form or console input
	        return "incorrectPassword123";
	    }

	    public static void login(String userInputPassword) {
	        if (!userInputPassword.equals(CORRECT_PASSWORD)) {
	            throw new Question6("Incorrect password. Please try again.");
	        } else {
	            System.out.println("Login successful.");
	            // Perform other tasks after successful login
	        }
	    }
	}

