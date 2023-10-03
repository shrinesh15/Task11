package task11;
	
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class Question8 {
		
	    public static void main(String[] args) {
	    	
	        String filename = "nonexistentfile.txt";

	        try {
	        	
	            String fileData = readFileData(filename);
	            System.out.println("File data: " + fileData);
	            
	        } 
	        
	        catch (FileNotFoundException e) {
	        	
	            System.err.println("Error: " + e.getMessage());
	        }
	        catch (IOException e) {
	        	
	            System.err.println("Error reading the file: " + e.getMessage());
	            
	        }
	    }

	    public static String readFileData(String filename) throws IOException {
	    	
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	        	
	            StringBuilder data = new StringBuilder();
	            String line;

	            while ((line = reader.readLine()) != null) {
	            	
	                data.append(line).append("\n");
	                
	            }

	            return data.toString();
	            
	        } 
	        catch (java.io.FileNotFoundException e) {
	        	
	            throw new FileNotFoundException("File not found: " + filename);
	            
	        }
	    }
	}

	class FileNotFoundException extends IOException {
		
	    public FileNotFoundException(String message) {
	    	
	        super(message);
	        
	    }
	}
