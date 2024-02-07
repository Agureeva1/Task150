package filosofia.java.p269.my_interface.game_factory;

import java.util.Random;

public class Dice implements Games{
    static final int MOVES = 5;

    @Override
    public void move() {
        System.out.println("Кидаем кубик " + MOVES + " раз");
        int times=0;
        Random random = new Random();
        while (times<MOVES) {
            int i = random.nextInt(0,6) + 1;
            switch (i) {
                case 1:
                    System.out.println("Выпало 1");
                    break;
                case 2:
                    System.out.println("Выпало 2");
                    break;
                case 3:
                    System.out.println("Выпало 3");
                    break;
                case 4:
                    System.out.println("Выпало 4");
                    break;
                case 5:
                    System.out.println("Выпало 5");
                    break;
                case 6:
                    System.out.println("Выпало 6");
                    break;
            }
            ++times;
        } System.out.println();

    }
}
