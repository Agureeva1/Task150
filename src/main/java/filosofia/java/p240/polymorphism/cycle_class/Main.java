package filosofia.java.p240.polymorphism.cycle_class;

public class Main {
    public static void main(String[] args) {
        Cycle cycle = new Unicycle();
        System.out.println(cycle.wheels());
        cycle.ride();

    }
}
