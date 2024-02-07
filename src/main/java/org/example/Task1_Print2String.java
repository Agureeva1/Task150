package org.example;

import java.util.Scanner;

public class Task1_Print2String {
    //Напишите программу на Java, которая напечатает «Hello» на экране,
    // а затем напечатайте свое имя в отдельной строке.
    public static void main(String[] args) {
        //Решение №1
        System.out.println("Hello\nAgureeva Anna");

        //Решение №2
        Scanner input = new Scanner (System.in);

        System.out.print("Input your first name: ");
        String fname = input.nextLine();
        System.out.print("Input your last name: ");
        String lname = input.nextLine();
        System.out.print("Input your  age: ");
        int age = input.nextInt();

        System.out.println();
        System.out.println("Hello\n"+fname+" "+lname+ " (" + age+ " лет (года))");
    }
}