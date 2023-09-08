public class Lab01 {

    public static void main(String[] args) {
        // Task 4
        System.out.println("Task 4");
        System.out.println("Hello, Puet!");

        // Task 5
        System.out.println("Task 5");
        for (int x = 0; x < 20; x = x + 2) {
            System.out.println("Value of X: " + x);
        }

        // Task 6
        System.out.println("Task 6");
        double pi, r, s;
        r = 12;
        pi = 3.1416;
        s = pi * r * r;
        System.out.println("The area of a circle with radius " + r + " is " + s);

        // Task 7
        System.out.println("Task 7");
        System.out.println("I'm Yevhenii Vyshnevskyi");
        System.out.println("I'm studying to be a software engineer");
        System.out.println("I'm studying at Poltava University of Economics and Trade");

        // Task 8
        System.out.println("Task 8");
        int y = 1;
        double z = 2.3;
        char year = 'a';
        boolean work = true;

        System.out.println("Integer is " + y + ". Double is " + z + ". Char is " + year + ". Boolean is " + work);

        // Task 9
        System.out.println("Task 9");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Task 10
        System.out.println("Task 10");
        for (int j = 2; j <= 32; j += 3) {
            System.out.println(j);
        }

        // Task 11
        System.out.println("Task 11");
        double radius, volume;
        radius = 13;
        volume = (4 / 3) * pi * (radius * 3);
        System.out.println(volume);
    }

}