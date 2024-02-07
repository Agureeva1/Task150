package filosofia.java.p269.my_interface.game_factory;

public class Factory {

    public static void startGame(GamesFactory factory) {
        Games game = factory.getGame();
        game.move();
    }
}
