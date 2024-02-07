package filosofia.java.p269.my_interface.cycle_factory;

public class Factories {

    public static void cycleMaker(CycleFactory factory) {
        Cycle c = factory.getCycle();
        System.out.print( c.getModel() + "\\");
        System.out.println( c.getPrice() + "руб");
        System.out.println(c);
    }
}
