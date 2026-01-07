public class Maths_dsa {

    // --------------------------------------------------
    // Fast Exponentiation (Binary Exponentiation)
    // Calculates a^pow in O(log pow) time
    // Handles negative powers as well
    // --------------------------------------------------
    public static double fastExpo(double a, int pow) {
        boolean isNeg = false;

        // Handle negative power
        if (pow < 0) {
            isNeg = true;
            pow = -pow;
        }

        double rslt = 1;

        // Binary exponentiation loop
        while (pow > 0) {
            // If power is odd, multiply result with base
            if (pow % 2 != 0) {
                rslt = rslt * a;
                pow--;
            }
            // Square the base and reduce power by half
            pow = pow / 2;
            a = a * a;
        }

        // If original power was negative, take reciprocal
        if (isNeg) {
            rslt = 1 / rslt;
        }

        return rslt;
    }

    // To convert any base to decimal

    public static void convertToDec(String num, int base) {
        int rslt = 0;
        int pos = 0;
        int length = num.length();
        for (int i = length - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            rslt = rslt + digit * (int) Math.pow(base, pos);
            pos++;
        }
        System.out.println("any base to decimal " + rslt);
    }

    // --------------------------------------------------
    // Reverse a number
    // Example: 123 -> 321, -12 -> 21
    // Prints the reversed number
    // --------------------------------------------------
    public static void reverse(int num) {
        int reverse = 0;

        // Edge case: 0
        if (num == 0) {
            reverse = 0;
        }

        // Convert negative number to positive
        if (num < 0) {
            num = -num;
        }

        // Reverse digit by digit
        while (num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        System.out.println("the no after reverse is " + reverse);
    }

    // --------------------------------------------------
    // Append a single digit at the end of a number
    // Example: appendDigit(234, 7) -> 2347
    // --------------------------------------------------
    public static int appendDigit(int num, int digit) {
        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        num = num * 10 + digit;
        return num;
    }

    // --------------------------------------------------
    // Append multiple digits at the end of a number
    // Example: appendDigit1(2121, 2345) -> 21212345
    // Uses String to count digits
    // --------------------------------------------------
    public static int appendDigit1(int nums, int digits) {
        // Convert digits to string to get length
        String s = String.valueOf(digits);
        int length = s.length();

        // Handle negative number
        if (nums < 0) {
            nums = -nums;
        }

        // Shift number by multiplying with 10^length
        nums = (int) (nums * Math.pow(10, length));

        // Add digits at the end
        nums = nums + digits;
        return nums;
    }

    // --------------------------------------------------
    // Count number of digits using logarithm
    // Example: 78456 -> 5
    // --------------------------------------------------
    public static int calDigits(int num) {
        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            num = -num;
        }

        int res = (int) Math.log10(num) + 1;
        return res;
    }

    // --------------------------------------------------
    // Insert a digit at the beginning of a number
    // Example: insetBeg(88954, 1) -> 188954
    // --------------------------------------------------
    public static int insetBeg(int nums, int digit) {
        int n = calDigits(nums);

        // Shift digit to the left by n places
        digit = (int) (digit * Math.pow(10, n));

        // Add original number
        nums = digit + nums;
        return nums;
    }

    // --------------------------------------------------
    // Count digits using loop method
    // Handles negative numbers and zero
    // --------------------------------------------------
    public int calDigits1(int num) {
        int count = 0;

        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            count = 1;
        }

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    // --------------------------------------------------
    // Main method to test all functions
    // --------------------------------------------------
    public static void main(String[] args) {

        // Digit counting
        System.out.println(calDigits(78456));

        Maths_dsa m1 = new Maths_dsa();
        int count = m1.calDigits1(0);
        System.out.println(count);

        // Append digit operations
        System.out.println(appendDigit(23432, 7));
        System.out.println(appendDigit1(-2121, 2345));

        // String concatenation example
        int a = 234;
        int b = 1;
        System.out.println(b + "" + a);

        // Insert digit at beginning
        System.out.println(insetBeg(88954, 1));

        // Reverse number
        reverse(0);
        reverse(1234);
        reverse(-12);

        // Fast exponentiation
        System.out.println(fastExpo(2, 4));

        convertToDec("1011", 8);
    }
}
