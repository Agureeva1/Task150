package filosofia.java.p240.polymorphism.cycle_class;

public class Unicycle extends Cycle{
    int wheel = 1;
    public void ride () {
        System.out.println("Я одноколесный велосипед и у меня " + wheel+" колеса");
    }
}
