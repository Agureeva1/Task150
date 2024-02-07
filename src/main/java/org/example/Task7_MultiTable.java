package org.example;

public class Task7_MultiTable {
//    Напишите программу на Java, которая принимает число в качестве входных данных и печатает свою таблицу умножения до 10.
//
//    Тестовые данные:
//    Введите число: 8

    public static void multiTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }


    public static void main(String[] args) {
        //Решение №1
        multiTable(11);
    }
}
