import java.io.*;

public class StudentFileDemo {

    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            bw.write("101 Bhavya 85");
            bw.newLine();
            bw.write("102 Rahul 78");
            bw.newLine();
            bw.write("103 Aisha 92");
            bw.newLine();

            bw.flush();
            System.out.println("Data written to file successfully.\n");

            
            br = new BufferedReader(new FileReader("students.txt"));

            System.out.println("Student Records:");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } 
        finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }

            System.out.println("\nFile operation completed (finally block executed).");
        }
    }
}