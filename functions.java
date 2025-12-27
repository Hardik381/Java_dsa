// Class to demonstrate method overloading
class Add {

    // Method to add two numbers
    public void add(int a, int b) {
        System.out.println("the sum of two numbers is " + (a + b));
    }

    // Method to add three numbers (method overloading)
    public void add(int a, int b, int c) {
        System.out.println("the sum of three number is " + (a + b + c));
    }
}

public class functions {

    // Non-static nested (inner) class
    // Object of this class can be created only using outer class object
    class Multiply {

        // Method to multiply two numbers
        public void mul(int a, int b) {
            System.out.println(a * b);
        }
    }

    // Static nested class
    // Object of this class can be created without outer class object
    static class difference {

        // Method to find difference of two numbers
        public void diff(int a, int b) {
            System.out.println(a - b);
        }
    }

    // Static function to add two numbers and return the result
    public static int add(int a, int b) {
        return a + b;
    }

    // Static function to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;

        // Loop runs until n becomes 0
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    // Static function to find maximum of two numbers
    public static void Max(int a, int b) {
        if (a > b) {
            System.out.println("the max number is a " + a);
        } else {
            System.out.println("the max number is b " + b);
        }
    }

    // Static function to print numbers from 0 to N
    public static void printNum(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    // Static function to swap two numbers
    // Note: swap happens only locally (call by value)
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(" ");
        System.out.println("the value of a is " + a + " and the value of b is " + b);
    }

    // Static function to calculate a raised to the power b
    public static void power(int a, int b) {
        int rslt = 1;

        // Loop to multiply 'a' b times
        for (int i = 1; i <= b; i++) {
            rslt = rslt * a;
        }
        System.out.println("the result is " + rslt);
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Calling add() method
        int sum = add(2, 5);
        System.out.println(sum);

        // Calling factorial() method
        int fact = factorial(5);
        System.out.println(fact);

        // Calling Max() method
        Max(19, 20);

        // Calling printNum() method
        printNum(10);

        // Calling swap() method
        swap(2, 4);

        // Calling power() method
        power(2, 4);

        // Creating object of Add class and calling overloaded methods
        Add a1 = new Add();
        a1.add(2, 4);
        a1.add(5, 6, 5);

        // Creating object of outer class to access inner class
        functions f = new functions();
        Multiply m1 = f.new Multiply();
        m1.mul(2, 3);

        // Creating object of static nested class
        difference d1 = new difference();
        d1.diff(5, 4);
    }
}
