public class Lab02 {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int q = 9, w = 7;
        System.out.println("The result of division q and w is: " + q / w); // 1
        System.out.println("The result of division q and w and remnant is: " + q % w); // 2

        // Task 2
        System.out.println("Task 2");
        int number = 367;
        long longNumber = number;
        short shortNumber = (short) number;
        byte byteNumber = (byte) number;
        double doubleNumber = number;

        System.out.println(longNumber); // 367
        System.out.println(shortNumber); // 367
        System.out.println(byteNumber); // 111
        System.out.println(doubleNumber); // 367.0

        // Task 3
        System.out.println("Task 3");
        float a = 5.4f, b = 3.2f, c = 7.627f;
        System.out.println("The sum is: " + (7 * b + a / c)); // 23.108011

        // Task 4
        System.out.println("Task 4");
        long result = (long) (7 * b + a / c);
        System.out.println(result); // 23

        // Task 5
        System.out.println("Task 5");
        int r = 578;
        int k1, k2, k3;

        k1 = r / 100; // 5
        k2 = r / 10 % 10; // 7
        k3 = r % 10; // 8

        System.out.println(k1 + k2 + k3); // 20

        // Task 6
        System.out.println("Task 6");
        for (int num = 100; num <= 999; num++) {
            System.out.println(num);
        }

        // Task 7
        System.out.println("Task 7");
        int t = 12;
        if (t % 2 == 0) {
            System.out.println("The number is paired");
        } else {
            System.out.println("The number isn't paired");
        }

        // Task 8
        System.out.println("Task 8");
        int someNumbers = 12345;
        int sumSomeNumbers;

        int kx1, kx2, kx3;

        kx1 = someNumbers / 10000;
        kx2 = (someNumbers % 1000) / 100;
        kx3 = someNumbers % 10;

        sumSomeNumbers = kx1 + kx2 + kx3;

        System.out.println("The sum of int in non-paried is: " + sumSomeNumbers);

        // Task 9
        System.out.println("Task 9");
        System.out.println(Math.sqrt(sumSomeNumbers));

        // Task 10
        System.out.println("Task 10");
        int bigNumber = 56278;
        int sumBigNumber = 0;

        while (bigNumber > 0) {
            int digit = bigNumber % 10;

            if (digit % 2 == 0) {
                sumBigNumber += digit;
            }

            bigNumber /= 10;
        }

        System.out.println(sumBigNumber);
    }
}