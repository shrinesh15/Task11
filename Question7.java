package task11;
	
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	  public class Question7 {
		  
	    public static void main(String[] args) {
	    	
	        try {
	            int age = getAgeFromUser();
	            validateAge(age);
	            System.out.println("Age is valid: " + age);
	        } catch (InvalidAgeException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }

	    public static int getAgeFromUser() {
	        
	        return 15; 
	        
	    }

	    public static void validateAge(int age) throws InvalidAgeException {
	    	
	        if (age < 18) {
	        	
	            throw new InvalidAgeException("Age must be 18 or older.");
	            
	        }
	    }
	}


