import java.util.ArrayList;
import java.util.Collections;

public class MarksArrayList {

    public static void main(String[] args) {

        
        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(85);
        marks.add(72);
        marks.add(91);
        marks.add(68);
        marks.add(95);

        
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
    }
}