package Java.lab07;

public class Lab07 {
    public static void main(String[] args) {
        // Test task 1
        System.out.println(geometricMean(6.0, 2.0)); // 3.4641..

        // Test task 2
        System.out.println(geometricMean(6.0, 3.4, 5.6)); // 4.8522...

        // Test task 3
        System.out.println(geometricMean(2.0, 3.5, 2.7, 4.5, 5.5)); // 3.4198...

        // Test task 5
        System.out.println(factorial(5)); // 120
        System.out.println(InterFactorial(5)); // 120

        // Test task 6
        System.out.println(interCountCharacters("Hello world!", 'o')); // 2
        System.out.println(countCharacters("Hello world!", 'o', 4)); // 2
    }

    // Task 1
    static double geometricMean(double a, double b) {
        return Math.pow(a * b, 1.0 / 2);
    }

    // Task 2
    static double geometricMean(double a, double b, double c) {
        return Math.pow(a * b * c, 1.0 / 3);
    }

    // Task 3
    static double geometricMean(double a1, double... a) {
        int count = 1;
        double multiply = a1;
        for (double x : a) {
            multiply *= x;
            count++;
        }

        return Math.pow(multiply, 1.0 / count);
    }

    // Task 5
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int InterFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    // Task 6
    static int interCountCharacters(String input, char targetChar) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }

    static int countCharacters(String input, char targetChar, int index) {
        if (index >= input.length()) {
            return 0;
        }

        int count = 0;
        if (input.charAt(index) == targetChar) {
            count = 1;
        }

        return count + countCharacters(input, targetChar, index + 1);
    }
}
