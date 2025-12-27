public class array {
    public static void main(String[] args) {

        // ---------------- ARRAY DECLARATION ----------------

        // int arr[]; 
        // // Only declaration → no memory allocated yet

        // int[] arr1 = new int[5]; 
        // // Declares array and allocates memory for 5 integers
        // // All values initialized to 0 by default

        // int arr2[] = new int[6]; 
        // Another way of declaring and allocating an array of size 6

        int arr3[] = { 1, 2, 3, 5, 6, 4 }; 
        // Declaration + initialization with values

        System.out.println(arr3[0]); 
        // Prints the first element of arr3 (index starts from 0)

        // ---------------- PRINT ALL ELEMENTS ----------------

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
            // Prints each element of the array
        }

        // ---------------- SUM OF ARRAY ELEMENTS ----------------

        int total = 0; 
        // Variable to store sum of elements

        for (int i = 0; i < arr3.length; i++) {
            total += arr3[i]; 
            // Adds each element to total
        }

        System.out.println();
        System.out.println("the total of all the elements in array is " + total);

        // ---------------- LARGEST & SMALLEST (MANUAL) ----------------

        int array[] = { 4, 3, 2, 9, 12, 6, 8 };

        int smallest = array[0]; 
        // Initialize smallest with first element

        int largest = array[0];  
        // Initialize largest with first element

        for (int i = 1; i < array.length; i++) {

            if (array[i] > largest) {
                largest = array[i];
                // Update largest if current element is bigger

            } else if (array[i] < smallest) {
                smallest = array[i];
                // Update smallest if current element is smaller

            } else {
                // Executes when element is neither largest nor smallest
                System.out.println("Tu to gya bete tu to gya");
            }
        }

        System.out.println(
            "the largest element is " + largest + 
            " and the smallest is " + smallest
        );

        // ---------------- LARGEST & SMALLEST USING Math ----------------

        for (int i = 1; i < array.length; i++) {

            largest = Math.max(largest, array[i]); 
            // Math.max returns the greater of two values

            smallest = Math.min(smallest, array[i]); 
            // Math.min returns the smaller of two values
        }

        System.out.println(
            "the largest element is " + largest + 
            " and the smallest is " + smallest
        );

        // ---------------- SECOND LARGEST (LONG METHOD) ----------------

        int[] new_array = { 3, 2, 5, 6, 45, 32, 8, 76, 8 };

        int f_largest = new_array[0]; 
        // Store first largest value

        for (int i = 1; i < new_array.length; i++) {
            if (f_largest < new_array[i]) {
                f_largest = new_array[i];
                // Update first largest
            } else {
                System.out.println("thinking");
            }
        }

        System.out.println(f_largest);

        int index = 0; 
        // To store index of largest element

        for (int i = 0; i < new_array.length; i++) {
            if (f_largest == new_array[i]) {
                index = i;
                // Save index of largest element
                break;
            } else {
                System.out.println("finding");
            }
        }

        int[] s_array = new int[new_array.length - 1];
        // New array after removing largest element

        for (int i = 0, j = 0; i < new_array.length; i++) {
            if (i == index) {
                continue;
                // Skip the largest element
            } else {
                s_array[j++] = new_array[i];
                // Copy remaining elements
            }
        }

        int s_largest = s_array[0]; 
        // Initialize second largest

        for (int i = 0; i < s_array.length; i++) {
            if (s_largest < s_array[i]) {
                s_largest = s_array[i];
                // Find largest in modified array
            } else {
                System.out.println("thinking");
            }
        }

        System.out.println("the second largest element is " + s_largest);

        // ---------------- SECOND LARGEST (BEST METHOD) ----------------

        int[] n_array = { 23, 12, 4, 5, 223, 65, 43, 23, 7, 223, 34 };

        int Largest = Integer.MIN_VALUE;
        // Stores largest value found so far

        int S_Largest = Integer.MIN_VALUE;
        // Stores second largest value

        for (int num : n_array) {

            if (num > Largest) {
                S_Largest = Largest;
                // Old largest becomes second largest
                Largest = num;
                // Update largest

            } else if (num > S_Largest && num != Largest) {
                S_Largest = num;
                // Update second largest
            }
        }

        System.out.println(S_Largest);
        // Prints second largest element
    }
}
