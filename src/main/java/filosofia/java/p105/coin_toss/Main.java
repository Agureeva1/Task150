package filosofia.java.p105.coin_toss;

import java.util.Random;

/* Напишите программу
 * моделирующую бросок монеты
 */
public class Main {
    public static void main(String[] args) {
        int a = 0;
        while (a<10) {
            System.out.println(coinToss());
            ++a;
        }
    }
    /**
     * Метод возвращает строку, принимающую одно из значений: орел или решка
     *
     * @return - строку "орел", если случайным образом выпадает число 2.
     * Строку "решка", если случайным образом выпадает число 1.
     */
    public static String coinToss () {
        Random rand = new Random();
        int a= rand.nextInt (2)+1;
        String s = (a>1?"орел":"решка");
        return s;
    }
}
