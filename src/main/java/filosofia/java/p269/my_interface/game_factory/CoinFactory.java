package filosofia.java.p269.my_interface.game_factory;

public class CoinFactory implements GamesFactory{

    @Override
    public Games getGame() {
        return new Coin();
    }
}
