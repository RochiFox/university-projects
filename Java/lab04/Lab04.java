public class Lab04 {

    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");

        for (int i = 3; i <= 10; i++) {
            System.out.print(i + " "); // 3 4 5 6 7 8 9 10
        }

        System.out.println();

        // Task 2
        System.out.println("Task 2");

        for (int i = 15; i >= 5; i--) {
            System.out.println(i); // 15 14 13 12 ... 6 5
        }

        // Task 3
        System.out.println("Task 3");

        for (int i = 1; i <= 17; i += 2) {
            System.out.print(i + " "); // 1 3 5 7 ... 15 17
        }

        System.out.println();

        // Task 4
        System.out.println("Task 4");

        for (int i = 2; i <= 256; i += i) {
            System.out.print(i + " "); // 2 4 8 16 ... 128 256
        }

        System.out.println();

        // Task 5
        System.out.println("Task 5");

        for (int i = 100; i >= 1; i /= 2) {
            System.out.println(i); // 100 50 25 ... 3 1
        }

        // Task 6
        System.out.println("Task 6");

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " "); // 1 2 3, 4 5 6, 7 8 9

            if (i % 3 == 0) {
                System.out.println();
            }
        }

        // Task 7
        System.out.println("Task 7");

        int num = 5;

        for (int i = 0; i < 8; i++) {
            System.out.print(num + " "); // 5 -10 20 -40 ... 320 -640
            num *= -2;
        }

        System.out.println();

        // Task 8
        System.out.println("Task 8");

        int n = 11;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(n + " "); // 11 12 13 14 15, 16 17 18 19, ...
                n++;
            }
            System.out.println();
        }

        // Task 9
        System.out.println("Task 9");

        n = 11;
        int maxRows = 5;
        int currentRowLength = maxRows;
        
        for (int i = 0; i < maxRows * 2 - 1; i++) {
            for (int j = 0; j < currentRowLength; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        
            if (i < maxRows - 1) {
                currentRowLength--;
            } else {
                currentRowLength++;
            }
        }

        // Task 10
        System.out.println("Task 10");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(j + " "); // 0 1 2 3 4 0 1 2 3 4 ...
            }
            System.out.print(" ");
        }

    }
}