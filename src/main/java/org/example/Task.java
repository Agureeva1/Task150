package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    // В 3х значном числе Х зачеркнули второе число. К получившемуся 2х значному числу добавили зачеркнутую цифру слева.
    //   Получилось число 435, найдите х. Число вводится с консоли

    public static void foundX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int newNum = scanner.nextInt();
        char[] arr = String.valueOf(newNum).toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        char a = list.get(0);
        list.remove(0);
        list.add(1, a);
        String x = "";
        for (int i = 0; i < list.size(); i++) {
            x += String.valueOf(list.get(i));
        }

        System.out.println("Число X = " + x);
    }

    public static void main(String[] args) {
        //Решение №1
        foundX();
    }
}
