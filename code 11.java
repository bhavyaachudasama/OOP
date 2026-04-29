import java.util.Scanner;

public class College {

    
    String collegeName;

    
    College(String collegeName) {
        this.collegeName = collegeName;
    }

    
    class Admission {
        String studentName;
        String course;

        
        void inputData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        
        void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); // accessing outer class variable
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

   
    public static void main(String[] args) {

      
        College college = new College("ABC Engineering College");

        
        College.Admission admission = college.new Admission();

        
        admission.inputData();
        admission.displayData();
    }
}