package task11;

import java.util.Scanner;


public class Question4 {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter the first integer: ");
	            int numerator = sc.nextInt();
	            
	            System.out.print("Enter the second integer: ");
	            int denominator = sc.nextInt();
	            
	            if (denominator == 0) {
	                System.out.println("Error: Division by zero is not allowed.");
	            } 
	            
	            else {
	                double result = (double) numerator / denominator;
	                System.out.println("Result of division: " + result);
	            }
	        }
	        
	        catch (java.util.InputMismatchException e) {
	            System.out.println("Error: Please enter valid integers.");
	        }
	        
	        finally {
	            sc.close();
	        }
	    }
	}

