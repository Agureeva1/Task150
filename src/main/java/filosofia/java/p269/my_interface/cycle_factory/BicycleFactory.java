package filosofia.java.p269.my_interface.cycle_factory;

public class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
