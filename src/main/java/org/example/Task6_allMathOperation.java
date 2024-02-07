package org.example;

import java.math.BigDecimal;
import java.math.MathContext;

public class Task6_allMathOperation {
//    Напишите Java-программу для печати суммы (сложения),
//    умножения, вычитания, деления и остатка двух чисел.
//
//    Тестовые данные:
//    Введите первое число: 125
//    Введите второе число: 24

    public static void allMathOperation(int a, int b) {

        MathContext mc = new MathContext(20);
        BigDecimal aa = new BigDecimal(a,mc);
        BigDecimal bb = new BigDecimal(b,mc);
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(b + " - " + a + " = " + (b-a));
        System.out.println(a + " / " + b + " = (int) " + (a/b) + "; (BD) " + aa.divide(bb, mc));
        System.out.println(b + " / " + a + " = (int " + (b/a) + "; (BD) " + bb.divide(aa, mc));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + "; остаток " + (a%b));
        System.out.println(b + " / " + a + "; остаток " + (b%a));
    }

    public static void main(String[] args) {
        //Решение №1
        allMathOperation(125,24);
    }
}
