package org.example;

import java.util.Scanner;

public class Task2_1_FormulaCalculation {
    public static void main(String[] args) {
//        //Составить программу:
//        // а) вычисления значения функции y = 17x2 – 6x + 13 при любом значении x;
//
//        System.out.println("Уравнение y = 17x2 – 6x + 13");
//        System.out.print("Укажите значение x: ");
        Scanner scanner = new Scanner(System.in);
//        try { double x = scanner.nextDouble();
//            System.out.println("При х = " + x + ", у = " + (17*Math.pow(x,2) - 6*x +13));
//
//        } catch (Exception e) {
//            System.out.println("Вы указали не число");
//
//        }
//        //Составить программу:
//        // б) вычисления значения функции y = 3a2 + 5a – 21 при любом значении а.
//        System.out.println("Уравнение y = 3a2 + 5a – 21");
//        System.out.print("Укажите значение a: ");
//        try { double a = scanner.nextDouble();
//            System.out.println("При a = " + a + ", у = " + (3*Math.pow(a,2) + 5*a -21));
//
//        } catch (Exception e) {
//            System.out.println("Вы указали не число");
//
//        }
//

//        System.out.println("Составить программу вычисления значения функции при любом значении а.\n " +
//                "a2 +10/Va2+1, где V обозначение корня, извлекаемого из знаменателя");
//        System.out.print("Укажите значение a: ");
//        try { double a = scanner.nextDouble();
//            System.out.println("При a = " + a + " функция = " + ((Math.pow(a,2) +10)/(Math.sqrt(Math.pow(a,2)+1)) ));
//
//        } catch (Exception e) {
//            System.out.println("Вы указали не число");
//
//        }
//
//
//        System.out.println("Составить программу вычисления значения функции при любом значении а.\n " +
//                "корень из 2a+sin|3a|/3,56");
//        System.out.print("Укажите значение a: ");
//        try { double a = scanner.nextDouble();
//            System.out.println("При a = " + a + " функция = " + Math.sqrt((2*a +Math.sin(Math.abs(3*a)))/3.56));
//
//        } catch (Exception e) {
//            System.out.println("Вы указали не число");
//
//        }
////        2.10. Даны два целых числа. Найти:
////        а) их среднее арифметическое;
////        б) их среднее геометрическое.
        try { System.out.print("Укажите значение a: ");
            double a = scanner.nextDouble();
            System.out.print("Укажите значение b: ");
            double b = scanner.nextDouble();
            System.out.println("Среднеарифметическое " + a + " и " + b + " = " + (a+b)/2);
            System.out.println("Среднегеометрическое " + a + " и " + b + " = " + Math.sqrt(a*b));
        } catch (Exception e) {
            System.out.println("Вы указали не число");

        }
}}