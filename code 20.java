import java.util.Scanner;
public class CommandLineDivision {
    public static void main(String[] args) {

        try {
            
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator.");
            }

            
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            
            int result = numerator / denominator;

            
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Missing command-line arguments.");
        } 
        catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}