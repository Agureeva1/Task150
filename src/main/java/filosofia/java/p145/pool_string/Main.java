package filosofia.java.p145.pool_string;
/*Создайте класс
 * с неинициализированнной ссылкой на String.
 * Покажите, что java проинициализирует ссылку null.
 */

import java.util.Scanner;

/*Создайте класс с полем String.
 * Инициализируйте поле String в точке определения,
 * и другое поле проинициализируйте в конструкторе.
 * Проанализируйте отличия походов.
 */
public class Main {
    String s;

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.s);

        InitString obj1 = new InitString("Hi");
        InitString obj2 = new InitString("Hi");

        System.out.println(obj1.getStr1() == obj2.getStr1());
        System.out.println(obj1.getStr2() == obj2.getStr2());
        System.out.println(obj1.getStr1() == obj2.getStr2());
        System.out.println(obj1.getStr3() == obj2.getStr3());
        obj1.setStr1("One");
        System.out.println(obj2.getStr1());
        System.out.println(obj1.getStr1());
        System.out.println(obj1.getStr1() == obj2.getStr1());
        Scanner scanner = new Scanner(System.in);
        InitString obj3 = new InitString(scanner.nextLine());
        System.out.println(obj2.getStr1() == obj3.getStr1());
        System.out.println(obj2.getStr2() == obj3.getStr2());
        System.out.println(obj2.getStr3() == obj3.getStr3());
        System.out.println(obj2.getStr3() + " " + obj2.getStr3().length());
        System.out.println(obj3.getStr3() + " " + obj3.getStr3().length());
    }
}
