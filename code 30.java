import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        
        String[] words = sentence.split("\\s+");

        
        HashMap<String, Integer> freqMap = new HashMap<>();

        
        for (String word : words) {

            
            if (freqMap.containsKey(word)) {
                freqMap.put(word, freqMap.get(word) + 1);
            } 
            
            else {
                freqMap.put(word, 1);
            }
        }

       
        System.out.println("\nWord Frequency:");

        for (String key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }

        sc.close();
    }
}