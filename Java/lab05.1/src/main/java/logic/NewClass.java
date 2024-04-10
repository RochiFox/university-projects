/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Flace
 */
public class NewClass {
    // Метод для перевірки "щасливості" числа способом 1
    public static boolean isLuckyMethod1(int number) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 6; i++) {
            if (i < 3)
                sum1 += number % 10;
            else
                sum2 += number % 10;
            number /= 10;
        }
        return sum1 == sum2;
    }

    // Метод для перевірки "щасливості" числа способом 2
    public static boolean isLuckyMethod2(int number) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0)
                sum1 += number % 10;
            else
                sum2 += number % 10;
            number /= 10;
        }
        return sum1 == sum2;
    }

    // Метод для генерації псевдовипадкового шестицифрового числа
    public static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000; // Генеруємо число від 100000 до 999999
    }

    // Метод для генерації 10000 псевдовипадкових чисел та їх перевірки на "щасливість" двома способами
    public static List<TreeSet<Integer>> generateAndCheckNumbers() {
        TreeSet<Integer> luckyNumbersMethod1 = new TreeSet<>();
        TreeSet<Integer> luckyNumbersMethod2 = new TreeSet<>();
        
        for (int i = 0; i < 10000; i++) {
            int number = generateRandomNumber();
            if (isLuckyMethod1(number)) {
                luckyNumbersMethod1.add(number);
            }
            if (isLuckyMethod2(number)) {
                luckyNumbersMethod2.add(number);
            }
        }
        
        List<TreeSet<Integer>> result = new ArrayList<>();
        result.add(luckyNumbersMethod1);
        result.add(luckyNumbersMethod2);
        
        return result;
    }
}
