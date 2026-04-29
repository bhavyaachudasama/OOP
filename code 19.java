import java.util.Scanner;


class Student {

    protected int rollNo;
    protected String name;

    
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

   
    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}


class Result extends Student {

    double marks1, marks2, marks3;

    
    Result(int rollNo, String name, double m1, double m2, double m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

   
    void displayResult() {

        System.out.println("----- MARK SHEET -----");

        displayStudent();

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);

        double total = marks1 + marks2 + marks3;
        double average = total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Marks 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Marks 3: ");
        double m3 = sc.nextDouble();

        
        Result r = new Result(roll, name, m1, m2, m3);

       
        r.displayResult();

        sc.close();
    }
}