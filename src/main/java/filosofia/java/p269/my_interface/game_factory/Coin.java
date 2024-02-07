package filosofia.java.p269.my_interface.game_factory;

import java.util.Random;

public class Coin implements Games{
    String player1= "Jon";
    String player2= "Samanta";
    static final int MOVES=7;

    @Override
    public void move() {
        System.out.println("Jon загадал орел, Samanta решка. Кидаем " + MOVES + " раза");
        int times=0;
        Random random = new Random();
        while (times<MOVES) {

          String result =  (random.nextInt(0, 2)==0?
                   "Выпал орел, Jon победил.":
                    "Выпало решка, Samanta победила");
            System.out.println(result);
            ++times;
        } System.out.println();
    }
}
