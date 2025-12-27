public class array1 {
    public static void main(String[] args) {

        // ---------------- COUNT ODD AND EVEN ELEMENTS ----------------

        int[] arr = { 1, 2, 3, 0, 4, 22, 35, 65, 23 };
        // Array containing integers

        int oddCount = 0;
        int evenCount = 0;
        // Variables to store count of odd and even numbers

        for (int num : arr) {
            // Enhanced for-loop to traverse array

            if (num % 2 == 0) {
                evenCount += 1;
                // Increment even counter if number is divisible by 2
            } else {
                oddCount += 1;
                // Increment odd counter if number is not divisible by 2
            }
        }

        System.out.println("the odd no of elements is " + oddCount);
        System.out.println("the even no of elements is " + evenCount);

        // ---------------- REVERSE AN ARRAY ----------------

        int[] rev = new int[arr.length];
        // New array to store reversed elements

        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
            // Traverse original array from end to start
            // j starts from 0 to fill reversed array

            rev[j++] = arr[i];
            // Copy elements in reverse order
        }

        for (int num : rev) {
            System.out.print(num + " ");
            // Print reversed array
        }
        System.out.println();

        // ---------------- CHECK IF ARRAY IS SORTED ----------------

        boolean check = true;
        // Assume array is sorted initially

        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        // Sorted array for checking

        for (int i = 0; i < arr1.length - 1; i++) {
            // Compare each element with the next element

            if (arr1[i] > arr1[i + 1]) {
                check = false;
                // If order breaks, array is not sorted
                break;
            }
        }

        if (check == true) {
            System.out.println("the array is sorted");
        } else {
            System.out.println("the array is not sorted");
        }

        // ---------------- ROTATE ARRAY BY 1 POSITION (RIGHT) ----------------

        int[] arr2 = { 2, 3, 4, 5, 6 };
        // Array to be rotated

        int temp = arr2[arr2.length - 1];
        // Store last element before shifting

        for (int i = arr2.length - 1; i > 0; i--) {
            arr2[i] = arr2[i - 1];
            // Shift elements one position to the right
        }

        arr2[0] = temp;
        // Place last element at the first position

        for (int num : arr2) {
            System.out.print(num + " ");
            // Print rotated array
        }
    }
}
