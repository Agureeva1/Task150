package filosofia.java.p240.polymorphism.cycle_class;

public class Bicycle extends Unicycle {
    int wheel = 2;
    public void ride () {
        System.out.println("Я мотоцикл и у меня " + wheel + " колеса");
    }
}
