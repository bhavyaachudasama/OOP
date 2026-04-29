import java.util.Scanner;

class VotingApp {

    
    void checkEligibility(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VotingApp app = new VotingApp();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            
            app.checkEligibility(age);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}