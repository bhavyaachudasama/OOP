import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAnalysis {

    public static void main(String[] args) {

        BufferedReader br = null;

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                lines++;

                
                String noSpaceLine = line.replaceAll("\\s+", "");
                characters += noSpaceLine.length();

                
                String[] wordArray = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            
            System.out.println("File Analysis Result:");
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters (excluding spaces): " + characters);

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error reading file - " + e.getMessage());
        } 
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file - " + e.getMessage());
            }

            System.out.println("\nFile processing completed.");
        }
    }
}