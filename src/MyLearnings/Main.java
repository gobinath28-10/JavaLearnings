package MyLearnings;

public class Main {

	public static void main(String[] args) {
		MathOperations demo = new MathOperations();

        // Compiler resolves which method to call at compile time
        System.out.println(demo.multiply(5, 4));          // Calls method 1 -> Outputs 20
        System.out.println(demo.multiply(2, 3, 4));       // Calls method 2 -> Outputs 24
        System.out.println(demo.multiply(2.5, 4.0));       // Calls method 3 -> Outputs 10.0
        
        demo.displayResult("Score", 100);

	}

}
