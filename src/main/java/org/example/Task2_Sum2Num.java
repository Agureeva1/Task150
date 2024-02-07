package org.example;

import java.util.Scanner;

public class Task2_Sum2Num {
    // Напишите программу на Java для вывода суммы двух чисел.
//    Тестовые данные: 74 + 36
//    Ожидаемый результат : 110


    public static int sumTwoInt(int a, int b) {
        return a + b;
    }


    public static void sumTwoIntScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        int fInt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Второе число: ");
        int sInt = scanner.nextInt();
        scanner.nextLine();
        System.out.println(fInt + sInt);
    }


    public static void main(String[] args) {
        //Решение №1
        System.out.println(sumTwoInt(74, 36));
        //Решение №2
        sumTwoInt(74,36);
        //Решение №3
        sumTwoIntScanner();
    }
}
