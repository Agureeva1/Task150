package filosofia.java.p240.polymorphism.cycle_class;

public class Cycle {
    int wheel = 2;

    public int wheels() {
        return this.wheel;
    }
    public void ride () {
        System.out.println("Я велосипед и у меня " + wheel  + " колеса");
    }
}
