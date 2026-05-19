// Importing utility classes
import java.util.*;

// Class demonstrating basic Map operations
public class mapInterface {

    public static void main(String[] args) {

        // Creating a HashMap
        // Integer -> Key
        // String -> Value
        Map<Integer, String> st = new HashMap<>();


        // ---------------- INSERTION ----------------

        st.put(1, "Arpit");
        st.put(2, "Aditya");
        st.put(3, "Akshita");
        st.put(4, "Sanskar");
        st.put(5, "Misbah");

        // Printing complete map
        System.out.println(st);


        // ---------------- SIZE OF MAP ----------------

        // Returns total number of key-value pairs
        System.out.println(st.size());


        // ---------------- CLEAR MAP ----------------

        // Removes all entries from map
        st.clear();

        // Printing empty map
        System.out.println(st);


        // Adding elements again
        st.put(2, "Aditya");
        st.put(3, "Akshita");
        st.put(4, "Sanskar");


        // ---------------- PUT IF ABSENT ----------------

        // Adds value only if key does not already exist
        st.putIfAbsent(5, "India");


        // ---------------- GET VALUE ----------------

        // Returns value associated with key 2
        System.out.println(st.get(2));


        // ---------------- GET DEFAULT VALUE ----------------

        /*
         * If key exists -> returns value
         * If key does not exist -> returns default value
         */
        System.out.println(st.getOrDefault(5, null));


        // ---------------- GET ALL KEYS ----------------

        // Returns all keys present in map
        System.out.println(st.keySet());


        // ---------------- GET ALL VALUES ----------------

        // Returns all values present in map
        System.out.println(st.values());
    }
}