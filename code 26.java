import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {

    public static void main(String[] args) {

        try {

            
            if (args.length == 0) {
                throw new IllegalArgumentException("Please provide file name as command-line argument.");
            }

            String fileName = args[0];

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            int lines = 0;
            int words = 0;
            int characters = 0;

            String line;

            while ((line = br.readLine()) != null) {

                lines++;

                
                characters += line.length();

                
                String[] wordArray = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            br.close();

            
            System.out.println("File Name: " + fileName);
            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);

        } 
        catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}