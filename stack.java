import java.util.ArrayList;

public class stack {
    public static void main(String[] args) {

        // -------------------------------
        // 1️⃣ FIND THE LARGEST ELEMENT
        // -------------------------------

        // Create an ArrayList of integers
        ArrayList<Integer> a1 = new ArrayList<>();

        // Add elements to the ArrayList
        a1.add(3);
        a1.add(5);
        a1.add(7);

        // Assume the first element is the largest
        int largest = a1.get(0);

        // Traverse the ArrayList to find the largest element
        for (int i = 0; i < a1.size() - 1; i++) {

            // Compare current element with the next element
            if (a1.get(i) < a1.get(i + 1)) {
                // Update largest if next element is greater
                largest = a1.get(i + 1);
            }
        }

        // Print the largest element
        System.out.println(largest);


        // -------------------------------
        // 2️⃣ REVERSE AN ARRAYLIST
        // -------------------------------

        // Original ArrayList
        ArrayList<Integer> a2 = new ArrayList<>();

        // ArrayList to store reversed elements
        ArrayList<Integer> a3 = new ArrayList<>();

        // Add elements 0 to 5 into a2
        for (int i = 0; i <= 5; i++) {
            a2.add(i);
        }

        // Print original ArrayList
        System.out.println(a2);

        // Traverse from last index to first index
        for (int i = a2.size() - 1; i >= 0; i--) {

            // Add elements in reverse order to a3
            a3.add(a2.get(i));
        }

        // Print reversed ArrayList
        System.out.println(a3);


        // ----------------------------------------
        // 3️⃣ REMOVE DUPLICATES FROM ARRAYLIST
        // ----------------------------------------

        // Original ArrayList with duplicates
        ArrayList<Character> a4 = new ArrayList<>();

        // ArrayList using contains() method
        ArrayList<Character> a5 = new ArrayList<>();

        // ArrayList using nested loops
        ArrayList<Character> a6 = new ArrayList<>();

        // Add duplicate elements
        a4.add('a');
        a4.add('a');
        a4.add('b');
        a4.add('c');

        // Print original ArrayList
        System.out.println(a4);

        // Remove duplicates using contains()
        for (int i = 0; i < a4.size(); i++) {

            // Add element only if it is not already present
            if (!a5.contains(a4.get(i))) {
                a5.add(a4.get(i));
            }
        }

        // Print ArrayList without duplicates
        System.out.println(a5);

        // Remove duplicates using manual comparison (nested loops)
        for (int i = 0; i < a4.size(); i++) {

            boolean found = false;

            // Check if element already exists in a6
            for (int j = 0; j < a6.size(); j++) {

                if (a4.get(i).equals(a6.get(j))) {
                    found = true;
                    break;
                }
            }

            // Add element if not found
            if (found == false) {
                a6.add(a4.get(i));
            }
        }

        // Print ArrayList without duplicates
        System.out.println(a6);
    }
}
