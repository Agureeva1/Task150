package filosofia.java.p269.my_interface.game_factory;

import static filosofia.java.p269.my_interface.game_factory.Factory.startGame;

/* Создайте на базе паттерна "Фабричный метод" программную среду,
* моделирующую броски монет и броски кубиков.
 */
public class Main {
    public static void main(String[] args) {
        startGame(new CoinFactory());
        startGame(new DiceFactory());
    }
}
