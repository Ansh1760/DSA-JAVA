// Importing utility classes like Set and HashSet
import java.util.*;

// Class name
public class queueBasics {

    // Main method - execution starts from here
    public static void main(String[] args) {

        // Creating first HashSet to store integer values
        Set<Integer> q = new HashSet<>();

        // Creating second HashSet
        Set<Integer> q2 = new HashSet<>();

        // Adding elements into first set
        q.add(10);
        q.add(20);
        q.add(101);
        
        q.add(14);
        q.add(108);

        // Adding elements into second set
        q2.add(10);
        q2.add(109);

        /*
         * containsAll() checks whether q2 contains
         * all elements present in q.
         *
         * Since q2 has only 10 and 109,
         * and q contains many more elements,
         * the result will be false.
         */

        // Printing the result
        System.out.println(q2.containsAll(q));
    }
}