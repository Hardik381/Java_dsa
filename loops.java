public class loops {

    // Main method: execution starts here
    public static void main(String[] args) {

        // Checking whether a number is even or odd
        int x = 7;
        if (x % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }

        // To check if a given year is a leap year
        int year = 2000;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("the year is leap");
        } else {
            System.out.println("the year is not leap");
        }

        // Finding the largest of three numbers
        int a = 10;
        int b = 22;
        int c = 14;
        if (a > b && a > c) {
            System.out.println("a is greatest");
        } else if (b > a && b > c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }

        // Using for loop to print numbers from 0 to n
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println("the value of n is " + i);
        }

        // Using while loop with break statement
        int i = 0;
        while (true) {
            if (i > 10) {
                break; // Terminates the loop
            } else {
                System.out.println("the value of is is " + i);
                i++;
            }
        }

        // To check whether a number is prime or composite
        int num = 13;
        int factor = 2;

        // Checking divisibility from 2 to num/2
        for (int j = 2; j <= (num / 2); j++) {
            if (num % j == 0) {
                factor += 1; // Increases factor count if divisible
            } else {
                System.out.println("just wondering for an answer");
            }
        }

        // Determining prime or composite
        if (factor != 2) {
            System.out.println("the given no is composite");
        } else {
            System.out.println("the given no is prime");
        }

        // Printing multiplication table of a number
        int table = 18;
        for (int j = 1; j <= 10; j++) {
            System.out.println(table + " * " + j + " = " + table * j);
        }

        // Counting the number of digits in a number
        int number = 435342;
        int count = 0;

        while (true) {
            int quotient = number / 10;   // Removes last digit
            int remainder = number % 10;  // Extracts last digit
            System.out.println("the remainder is " + remainder);

            if (quotient == 0) {
                count++;
                System.out.println("the number of digits in the given number is " + count);
                break;
            } else {
                number = quotient;
                count++;
            }
        }

        // Reversing a number using String method
        int originalNum = 124;
        String str = String.valueOf(originalNum); // Convert int to String
        System.out.println("the String is " + str);

        String rev = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            rev += str.charAt(j); // Appending characters in reverse order
        }

        System.out.println("the reverse no is " + rev);

        int reverse = Integer.parseInt(rev); // Convert String back to int
        System.out.println("the given no is reversed " + reverse);

        // Reversing a number and checking palindrome using logic
        int oriNum = 121;
        int ulta = 0;
        int copy = oriNum; // Storing original number

        while (oriNum != 0) {
            int rem = oriNum % 10;      // Extract last digit
            oriNum = oriNum / 10;       // Remove last digit
            ulta = ulta * 10 + rem;     // Build reversed number
        }

        System.out.println("the reversed no is " + ulta);

        // Checking palindrome condition
        if (copy == ulta) {
            System.out.println("the given no is palindrome");
        } else {
            System.out.println("the given no is not palindrome");
        }

        // Printing a right-angled triangle star pattern
        int m = 4;
        for (int j = 1; j <= m; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println(); // Moves to next line
        }
    }
}
