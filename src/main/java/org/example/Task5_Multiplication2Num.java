package org.example;

import java.util.Scanner;

public class Task5_Multiplication2Num {
    //    Напишите программу на Java, которая принимает два числа в качестве входных данных и отображает произведение двух чисел.
//
//    Тестовые данные:
//    Введите первое число: 25
//    Введите второе число: 5
    public static void multNumbers(int a, int b) {
        System.out.println(a*b);
    }

    public static void multNumbersScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите первое число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Укажите второе число: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Результат умножения: " + a*b);
    }


    public static void main(String[] args) {
        //Решение №1
        multNumbers(25,5);

        //Решение №2
        multNumbersScanner();
    }
}
