package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Task3_Division2Num {
//Напишите программу на Java, чтобы разделить два числа и напечатать на экране.

    public static void divTwoDoubleScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        double fDouble = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Второе число: ");
        double sDouble = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(fDouble/sDouble);
    }

    public static void main(String[] args) {
        //Решение №1
        System.out.println(35d/12d);
        System.out.println(50.0/3.0);
        System.out.println(35f/12f);

        //Решение №2
        MathContext mc = new MathContext(20);
        BigDecimal a = new BigDecimal(35, mc);
        BigDecimal b = new BigDecimal(12, mc);
        System.out.println(a.divide(b, mc));

        //Решение №3
        divTwoDoubleScanner();
    }
}
