public class Lab06 {
    public static void main(String[] args) {
        // // Test task 13
        // System.out.println(countWord("Hello world, test!")); // 3
        // System.out.println(countWord("Test with the biggest string")); // 5

        // // Test task 1
        // System.out.println(biggestNumber(9, 5, 7)); // 9
        // System.out.println(biggestNumber(2, 3, 15)); // 15

        // // Test task 4
        // System.out.println(checkDividedNumber(3, 2)); // false
        // System.out.println(checkDividedNumber(4, 2)); // true

        // Test task 5
        System.out.println(checkPrimeNumber(3));
        System.out.println(checkPrimeNumber(4));
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

    // Task 13
    static int countWord(String input) {
        String[] arrString = input.split(" ");
        return arrString.length;
    }

}