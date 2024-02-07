package filosofia.java.p269.my_interface.game_factory;

public class DiceFactory implements GamesFactory{
    @Override
    public Games getGame() {
        return new Dice();
    }
}
