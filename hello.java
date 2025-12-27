// Importing Scanner class for user input
import java.util.*;

public class hello {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Printing Hello World
        System.out.println("hello world");

        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Declaring two integer variables
        int a = 12;
        int b = 3;

        // Performing arithmetic operations
        System.out.println(a + b); // Addition
        System.out.println(a - b); // Subtraction
        System.out.println(a * b); // Multiplication
        System.out.println(a % b); // Modulus (remainder)
        System.out.println(a / b); // Division

        // Variables for swapping
        int x = 10;
        int y = 20;
        int temp;

        // Printing values before swapping
        System.out.println("before swapping \n");
        System.out.println("the value of x is " + x);
        System.out.println("the value of y is " + y);

        // Swapping using temporary variable
        System.out.println("after swapping \n");
        temp = x;
        x = y;
        y = temp;

        // Printing values after swapping
        System.out.println("the value of x is " + x);
        System.out.println("the value of y is " + y);

        // Swapping without using temporary variable (using + and -)
        System.out.println(" ");
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("the value of x is " + x);
        System.out.println("the value of y is " + y);
        System.out.println(" ");

        // Swapping using XOR operator
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("the value of x is " + x);
        System.out.println("the value of y is " + y);

        // Checking whether a number is positive, negative, or zero
        int n = 10;

        if (n > 0) {
            System.out.println("the number is postive");
        } else if (n == 0) {
            System.out.println("the number is 0");
        } else {
            System.out.println("the number is negative");
        }

        // Implicit type conversion (int to double)
        int o = 10;
        double p = o;
        System.out.println(p);

        // Explicit type conversion (double to int)
        double j = 10.32;
        System.out.println(j);
        int k = (int) j;
        System.out.println(k);

        // Finding ASCII value of a character
        char ch = 'A';
        int ascii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);

        // Converting ASCII value to character
        int asc = 68;
        char c = (char) asc;
        System.out.println("the character is " + c);

        // Calculating Simple Interest
        int prinicipal = 1000;
        int rate = 2;
        int time = 3;

        double simpleInterest = (prinicipal * rate * time) / 100;
        System.out.println("the simple interest will be " + simpleInterest);

        double tAmount = prinicipal + simpleInterest;
        System.out.println("the total amount is " + tAmount);

        // Taking a character and printing its ASCII value
        char character = 'H';
        int value = character;
        System.out.println("the value for H is " + value);

        int value1 = (int) character;
        System.out.println("the value for H is " + value1);

        // Closing Scanner object
        sc.close();
    }
}
