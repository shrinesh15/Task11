package task11;

public class Question5 {
	
	    public static void main(String[] args) {
	    	
	        int[] numbers = {1, 2, 3, 4, 5};

	        int index = 10;
	        
	        try {
	        	
	            int element = numbers[index];
	            System.out.println("Element at index " + index + ": " + element);
	            
	        } 
	        
	        catch (ArrayIndexOutOfBoundsException e) {
	        	
	            System.out.println("Error: Array index out of bounds.");
	            
	        }
	    }
	}

