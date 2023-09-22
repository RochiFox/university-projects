public class Lab03 {

    public static void main(String[] args) {
        // Task A
        System.out.println("Task A");

        double[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("The number array what divides 3 is: ");

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 3 == 0) {
                System.out.println(A[i]); // 3.0, 6.0, 9.0
            }
        }

        int[] B = new int[8];

        for (int i = 0; i < B.length; i++) {
            B[i] = (int) A[i];
        }

        System.out.println("Unpaired number is: ");

        for (int i = 0; i < B.length; i += 2) {
            System.out.println(B[i]); // 1, 3, 5, 7
        }

        long[][] C = {
                { 1, 2, 3, 4 },
                { 2, 3, 4, 5 },
                { 3, 4, 5, 6 }
        };

        System.out.println("The array of C is: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + " "); // 1 2 3 4, 2 3 4 5, 3 4 5 6
            }
            System.out.println();
        }

        // Task B
        System.out.println("Task B");

        short[] D = { 1, 5, 7, 4, 15, 32, 58, 3, 9, 10, 224, 1 };

        System.out.println("The number array what divides 4 and mode then 0 is: ");

        for (int i = 0; i < D.length; i++) {
            if (D[i] % 4 == 0 && D[i] > 0) {
                System.out.println(D[i]); // 4, 32, 224
            }
        }

        float[] D1 = new float[9];

        for (int i = 0; i < D1.length; i++) {
            D1[i] = (float) D[i] / 2;
        }

        System.out.println("The every 3 number of array D1 that divided in 2 is: ");

        for (int i = 0; i < D1.length; i += 3) {
            System.out.println(D1[i]); // 0.5, 2.0, 29.0
        }

        byte[][] E = {
                { 1, 3, 5, 7 },
                { 2, 8, 14, 5 },
                { 3, 6, 2, 1 },
                { 4, 7, 7, 2 },
                { 9, 20, 5, 4 }
        };

        short[][] E1 = {
                { 5, 4, 8, 2 },
                { 13, 9, 7, 5 },
                { 8, 2, 1, 4 },
                { 5, 5, 7, 2 },
                { 1, 5, 3, 9 }
        };

        System.out.println("The sum of arrays E and E1 is: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                E1[i][j] += (short) E[i][j];
                System.out.print(E1[i][j] + " ");
            }
            System.out.println(); // 6 7 13 9, 15 17 21 10, 11 8 3 5, 9 12 14 4, 10 25 8 13
        }

        byte E2 = 0;

        System.out.println("The sum of every row E is: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                E2 += E[i][j];
            }
            System.out.println(E2); // 16, 29, 12, 20, 38
            E2 = 0;
        }
    }
}