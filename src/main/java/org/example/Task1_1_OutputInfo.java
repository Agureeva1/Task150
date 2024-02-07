package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_1_OutputInfo {
    public static void main(String[] args) {
        {
            System.out.println("Выведите в одну строку три числа");
            int q = 23;
            int w = 45;
            int r = 98;
            System.out.printf("%d  %d  %d\n", q, w, r);

            System.out.println("Выведите на экран три числа одно под другим");
            System.out.printf("%d\n%d\n%d\n", q, w, r);
        }

        System.out.println("Выведите на экран число пи с 3я цифрами после запятой");
        double p = Math.PI;
        System.out.printf("%.3f\n", p);

        {
            System.out.println("Выведите на экран число e с точностью до десятой");
            double e = Math.E;
            double scale = Math.pow(10, 1);
            double roundNumber = Math.round(e * scale) / scale;
            System.out.println(roundNumber);

            DecimalFormat df = new DecimalFormat("#.#");
            System.out.println(df.format(e));
        }

        System.out.println("Введите число с клавиатуры, в ответ программа должна написать - вот такое число вы ввели");
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        try {
            System.out.print("Число: ");
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }
        System.out.printf("%d - вот такое число вы ввели\n", num);

        System.out.println("Напишите программу, которая при вводе числа выводит предыдущее и следующее число");
        System.out.print("Число: ");
        int num1 = scanner.nextInt();
        System.out.println("Предыдущее число " + (num1-1));
        System.out.println("Следующее число " + (num1+1));
        
        System.out.println("Напишите программу вывода на экран в одну строку трех любых чисел, введенных с клавиатуры");
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        try {
            System.out.print("Введите 3 числа через пробел: ");
           n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели не число");
        }
        System.out.printf("%d %d %d\n", n1,n2,n3);
    }

}
