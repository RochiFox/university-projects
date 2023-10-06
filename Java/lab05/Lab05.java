package Java.lab05;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        // Task A
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();

        // System.out.println(a*a); // Multiple two number

        // String s1, s2;

        // s1 = sc.next();
        // s2 = sc.next();

        // System.out.println(s2 + s1); // Added second number to first

        // Task B
        // Task 1
        System.out.println("Task 1");

        System.out.print("Please enter a number: ");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is paired");
        } else {
            System.out.println("The number isn't paired");
        }

        // Task 2
        System.out.println("Task 2");

        System.out.println("Please enter a two double numbers: ");

        System.out.print("Number 1: ");
        double doubleNum1 = sc.nextDouble();
        System.out.print("Number 2: ");
        double doubleNum2 = sc.nextDouble();

        System.out.println("The result of divisions 2 numbers is: " + (doubleNum1 / doubleNum2));

        // Task 3
        System.out.println("Task 3");

        System.out.print("Please enter a month number: ");
        int monthNum = sc.nextInt();
        String season;

        System.out.print("The month is: ");
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                System.out.println(season);
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                System.out.println(season);
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                System.out.println(season);
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                System.out.println(season);
                break;
            default:
                System.out.println("There's no such month. Please enter a valid month");
        }

        // Task 4
        System.out.println("Task 4");

        System.out.print("PLease enter a number grade (1 - 100): ");
        int grade = sc.nextInt();

        if (grade >= 90) {
            System.out.println("The grade is A");
        } else if (grade >= 74) {
            System.out.println("The grade is B");
        } else if (grade >= 60) {
            System.out.println("The grade is C");
        } else if (grade >= 44) {
            System.out.println("The grade is D");
        } else {
            System.out.println("The grade is F");
        }
    }
}
