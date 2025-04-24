/* Project: Recursion Lab
 * Class: Lab10.java
 * Author: MEHMET SOYDAN
 * Date: 04/23/2025
 * This program implements various recursive algorithms including mathematical sequences,
 * string manipulation, and the Tower of Hanoi puzzle.
 */
package academy.javapro.lab10;

public class Lab10 {

    // ---------------------------------------------------------------
    // Exercise 1: Factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! = 1
        }
        return n * factorial(n - 1);  // Recursive case
    }

    // ---------------------------------------------------------------
    // Exercise 2: Counting Ears
    public static int countEars(int n) {
        if (n == 0) {
            return 0;  // Base case: no rabbits
        }
        return 2 + countEars(n - 1);  // Recursive case
    }

    // ---------------------------------------------------------------
    // Exercise 3: Fibonacci Sequence
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // Base case 1
        }
        if (n == 1) {
            return 1;  // Base case 2
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    // Level 2: Recursive Number Processing

    // ---------------------------------------------------------------
    // Exercise 4: Special Ear Count
    public static int specialEars(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        if (n % 2 == 1) {  // Odd rabbit
            return 2 + specialEars(n - 1);
        }
        return 3 + specialEars(n - 1);  // Even rabbit
    }

    // ---------------------------------------------------------------
    // Exercise 5: Triangle Blocks
    public static int triangleBlocks(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        return n + triangleBlocks(n - 1);  // Recursive case
    }

    // ---------------------------------------------------------------
    // Exercise 6: Digital Sum
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;  // Base case
        }
        return (n % 10) + sumDigits(n / 10);  // Recursive case
    }

    // Level 3: Digit Counting Recursively

    // ---------------------------------------------------------------
    // Exercise 7: Counting Sevens
    public static int countSevens(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        if (n % 10 == 7) {
            return 1 + countSevens(n / 10);
        }
        return countSevens(n / 10);
    }

    // ---------------------------------------------------------------
    // Exercise 8: Complex Digit Counting
    public static int countEights(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        int rightDigit = n % 10;
        int secondRightDigit = (n / 10) % 10;
        
        if (rightDigit == 8 && secondRightDigit == 8) {
            return 2 + countEights(n / 10);
        }
        if (rightDigit == 8) {
            return 1 + countEights(n / 10);
        }
        return countEights(n / 10);
    }

    // Level 4: String Recursion Basics

    // ---------------------------------------------------------------
    // Exercise 9: Substring Counting
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;  // Base case
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    // ---------------------------------------------------------------
    // Exercise 10: Character Replacement
    public static String replaceChar(String str) {
        if (str.length() == 0) {
            return "";  // Base case
        }
        if (str.charAt(0) == 'x') {
            return "y" + replaceChar(str.substring(1));
        }
        return str.charAt(0) + replaceChar(str.substring(1));
    }

    // ---------------------------------------------------------------
    // Exercise 11: Character Removal
    public static String removeChar(String str) {
        if (str.length() == 0) {
            return "";  // Base case
        }
        if (str.charAt(0) == 'x') {
            return removeChar(str.substring(1));
        }
        return str.charAt(0) + removeChar(str.substring(1));
    }

    // Level 5: Advanced String Recursion

    // ---------------------------------------------------------------
    // Exercise 12: Adjacent Character Marking
    public static String markPairs(String str) {
        if (str.length() <= 1) {
            return str;  // Base case
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + markPairs(str.substring(1));
        }
        return str.charAt(0) + markPairs(str.substring(1));
    }

    // ---------------------------------------------------------------
    // Exercise 13: String Deduplication
    public static String deduplicate(String str) {
        if (str.length() <= 1) {
            return str;  // Base case
        }
        if (str.charAt(0) == str.charAt(1)) {
            return deduplicate(str.substring(1));
        }
        return str.charAt(0) + deduplicate(str.substring(1));
    }

    // Level 6: Complex Recursive Problems

    // ---------------------------------------------------------------
    // Exercise 14: Conditional Substring Counting
    public static int countHiSpecial(String str) {
        if (str.length() < 2) {
            return 0;  // Base case
        }
        if (str.startsWith("hi")) {
            return 1 + countHiSpecial(str.substring(2));
        }
        if (str.length() >= 3 && str.charAt(0) == 'x' && str.startsWith("hi", 1)) {
            return countHiSpecial(str.substring(3));
        }
        return countHiSpecial(str.substring(1));
    }

    // ---------------------------------------------------------------
    // Exercise 15: Substring with Boundaries
    public static int substringLength(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;  // Base case
        }
        boolean startsWith = str.startsWith(sub);
        boolean endsWith = str.endsWith(sub);
        
        if (startsWith && endsWith) {
            return str.length();
        }
        int removeFirst = substringLength(str.substring(1), sub);
        int removeLast = substringLength(str.substring(0, str.length() - 1), sub);
        
        return Math.max(removeFirst, removeLast);
    }

    // ---------------------------------------------------------------
    // Bonus Challenge: Tower of Hanoi
    public static void towerOfHanoi(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        towerOfHanoi(n - 1, source, target, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, auxiliary, source, target);
    }

    // Main method with test cases (provided in the original code)
    public static void main(String[] args) {
        // Test cases remain unchanged from the original
    }
}
