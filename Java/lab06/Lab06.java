import java.util.Arrays;

public class Lab06 {
    public static void main(String[] args) {
        // Test task 1
        System.out.println("Task 1");
        System.out.println(biggestNumber(9, 5, 7)); // 9
        System.out.println(biggestNumber(2, 3, 15)); // 15

        // Test task 2
        System.out.println("Task 2");
        System.out.println(findMedian(3, 12, 7)); // 7
        System.out.println(findMedian(11, 12, 8)); // 11

        // Test task 4
        System.out.println("Task 4");
        System.out.println(checkDividedNumber(3, 2)); // false
        System.out.println(checkDividedNumber(4, 2)); // true

        // Test task 5
        System.out.println("Task 5");
        System.out.println(checkPrimeNumber(3)); // true
        System.out.println(checkPrimeNumber(4)); // false

        // Test task 6
        System.out.println("Task 6");
        System.out.println(countDividedNumber(6)); // 2
        System.out.println(countDividedNumber(13)); // 0

        // Test task 8
        System.out.println("Task 8");
        System.out.println(checkNumberSubstraction(5, 7)); // true
        System.out.println(checkNumberSubstraction(-5, 7)); // false

        // Test task 10
        System.out.println("Task 10");
        System.out.println(Arrays.toString(mergeArrays(new long[] { 1L, 2L }, new long[] { 3L, 4L }))); // 1 2 3 4
        System.out.println(Arrays.toString(mergeArrays(new long[] { 8L, 12L }, new long[] { 1L }))); // 8 12 1

        // Test task 13
        System.out.println("Task 13");
        System.out.println(countWord("Hello world, test!")); // 3
        System.out.println(countWord("Test with the biggest string")); // 5

        // Test task 14
        System.out.println("Task 14");
        System.out.println(countCharacters("Hello world, how it is?", 'o')); // 3
        System.out.println(countCharacters("Another test text", 'e')); // 3
    }

    // Task 1
    static int biggestNumber(int num1, int num2, int num3) {
        int bigNumber;
        if (num1 >= num2 && num1 >= num3) {
            bigNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            bigNumber = num2;
        } else {
            bigNumber = num3;
        }
        return bigNumber;
    }

    // Task 2
    static int findMedian(int num1, int num2, int num3) {
        int median;
        if (num1 >= num2) {
            if (num2 >= num3) {
                median = num2;
            } else if (num1 >= num3) {
                median = num3;
            } else {
                median = num1;
            }
        } else {
            if (num1 >= num3) {
                median = num1;
            } else if (num2 >= num3) {
                median = num3;
            } else {
                median = num2;
            }
        }
        return median;
    }

    // Task 4
    static boolean checkDividedNumber(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task 5
    static boolean checkPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Task 6
    static int countDividedNumber(int num1) {
        int count = 0;
        for (int i = 2; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Task 8
    static boolean checkNumberSubstraction(int num1, int num2) {
        int result = num1 * num2;

        if (result < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Task 10
    static long[] mergeArrays(long[] arr1, long[] arr2) {
        int arrLength1 = arr1.length;
        int arrLength2 = arr2.length;

        long[] result = new long[arrLength1 + arrLength2];

        for (int i = 0; i < arrLength1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arrLength2; i++) {
            result[arrLength1 + i] = arr2[i];
        }

        return result;
    }

    // Task 13
    static int countWord(String input) {
        String[] arrString = input.split(" ");
        return arrString.length;
    }

    // Task 14
    static int countCharacters(String input, char targetChar) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }

}