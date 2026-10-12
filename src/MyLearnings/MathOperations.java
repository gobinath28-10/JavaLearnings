package MyLearnings;

public class MathOperations {
	
	

	    // 1. Base method: takes two integers
	    public int multiply(int a, int b) {
	    	
	    	System.out.println("two int method");
	        return a * b;
	    }

	    // 2. Overloaded: different number of parameters (three ints)
	    public int multiply(int a, int b, int c) {
	    	
	        return a * b * c;
	    }

	    // 3. Overloaded: different data types (two doubles)
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    // 4. Overloaded: different order of parameter types
	    public void displayResult(String label, int value) {
	        System.out.println(label + ": " + value);
	    }

	    public void displayResult(int value, String label) {
	        System.out.println(value + " belongs to " + label);
	    }
	}

	



