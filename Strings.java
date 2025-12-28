import java.util.*; // Imports utility classes like Scanner and Arrays

public class Strings {
    public static void main(String[] args) {

        // Declaring a string using string literal
        String name = "HarShiT1234";
        System.out.println("your name is " + name);

        // Creating a String object using new keyword
        String str = new String("hello world");
        System.out.println(str);

        // Checking if two strings are same (reference comparison)
        String a = "java";
        String b = "java";
        System.out.println(a == b); // true → same reference (string pool)
        System.out.println(a.equals(b)); // true → same content

        // Creating strings using new keyword (different memory references)
        String st1 = new String("python");
        String st2 = new String("python");

        System.out.println(st1 == st2); // false → different references
        System.out.println(st1.equals(st2)); // true → same content

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Example of Scanner buffer issue (commented)
        // int x = sc.nextInt();
        // sc.nextLine(); // consumes leftover newline character
        // String st5 = sc.nextLine();

        sc.close(); // Closing scanner to avoid resource leak

        // ---------------- VOWEL COUNT ----------------

        // String to count vowels
        String st6 = "Hardik Pandey";

        // Convert string to lowercase to simplify comparison
        String str2 = st6.toLowerCase();
        int count = 0;

        // Loop through each character
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("the total no of vowels is " + count);

        // ---------------- REVERSE STRING & PALINDROME ----------------

        String rev = "";

        // Reverse the string
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }

        // Check palindrome
        if (name.equals(rev)) {
            System.out.println("the String is palindrome");
        } else {
            System.out.println("the String is not palindrome");
        }
        System.out.println(rev);

        // ---------------- COUNT UPPERCASE (LOGIC METHOD) ----------------

        String copy = name.toLowerCase();
        int upper = 0;

        // Compare original string with lowercase version
        for (int i = 0; i < name.length(); i++) {
            if (copy.charAt(i) != name.charAt(i)) {
                upper++;
            }
        }
        System.out.println("the number of upper case letter are " + upper);

        // ---------------- COUNT USING CHARACTER CLASS ----------------

        int upper_new = 0;
        int lower = 0;
        int digit = 0;

        // Traverse each character
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            // Check uppercase
            if (Character.isUpperCase(ch)) {
                upper_new++;
            }
            // Check lowercase
            else if (Character.isLowerCase(ch)) {
                lower++;
            }
            // Check digit
            else if (Character.isDigit(ch)) {
                digit++;
            }
        }

        System.out.println("the number of upper case letters " + upper_new);
        System.out.println("the number of lower case letters " + lower);
        System.out.println("the number of digits are " + digit);

        // ---------------- COUNT SPACES ----------------

        String str3 = "hard k p a  a n dey ";
        int space = 0;

        // Count spaces using character comparison
        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) == ' ') {
                space++;
            }
        }
        System.out.println("the number of spaces in the string is " + space);

        // ---------------- STRING TO CHAR ARRAY (MANUAL) ----------------

        char[] ch = new char[str3.length()];

        // Copy characters manually
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str3.charAt(i);
        }

        // Print character array
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ---------------- STRING TO CHAR ARRAY (BEST WAY) ----------------

        char[] ch1 = str3.toCharArray();
        for (char c : ch1) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ---------------- REMOVE DUPLICATE CHARACTERS (NESTED LOOP) ----------------

        String str11 = "harharmahadev";
        String dup = "";

        for (int i = 0; i < str11.length(); i++) {
            boolean found = false;
            char c = str11.charAt(i);

            // Check if character already exists
            for (int j = 0; j < dup.length(); j++) {
                if (c == dup.charAt(j)) {
                    found = true;
                    break;
                }
            }

            // Add only if not found
            if (!found) {
                dup += c;
            }
        }
        System.out.println("the new string is " + dup);

        // ---------------- REMOVE DUPLICATES USING BOOLEAN ARRAY ----------------

        boolean[] visited = new boolean[256];
        String rslt = "";

        for (int i = 0; i < str11.length(); i++) {
            char c = str11.charAt(i);

            // Check ASCII index
            if (!visited[c]) {
                visited[c] = true;
                rslt += c;
            }
        }
        System.out.println(rslt);

        // ---------------- FIRST NON-REPEATING CHARACTER ----------------

        int[] arr = new int[256];
        String str9 = "aabbcdd";
        boolean foundChar = false;

        // Count frequency of each character
        for (int i = 0; i < str9.length(); i++) {
            arr[str9.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < str9.length(); i++) {
            if (arr[str9.charAt(i)] == 1) {
                System.out.println("the character is " + str9.charAt(i));
                foundChar = true;
                break;
            }
        }

        if (!foundChar) {
            System.out.println("no repeating character is found");
        }

        // ---------------- ANAGRAM USING COUNTING ----------------

        String str7 = "silent";
        String str8 = "pisten";
        boolean anagram = true;

        // Length check
        if (str7.length() != str8.length()) {
            System.out.println("the strings are not anagram");
        }

        int[] a1 = new int[256];

        // Increment count for first string
        for (int i = 0; i < str7.length(); i++) {
            a1[str7.charAt(i)]++;
        }

        // Decrement count for second string
        for (int j = 0; j < str8.length(); j++) {
            a1[str8.charAt(j)]--;
        }

        // Check if all values are zero
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            System.out.println("the strings are anagram");
        } else {
            System.out.println("the strings are not anagram");
        }

        // ---------------- ANAGRAM USING SORTING ----------------

        char[] c3 = str7.toCharArray();
        char[] c4 = str8.toCharArray();

        // Sort both arrays
        Arrays.sort(c3);
        Arrays.sort(c4);

        boolean rsl = true;

        // Compare sorted arrays
        for (int i = 0; i < c3.length; i++) {
            if (c3[i] != c4[i]) {
                rsl = false;
                break;
            }
        }

        if (rsl) {
            System.out.println("the strings are anagram");
        } else {
            System.out.println("the strings are not anagrams");
        }
    }
}
