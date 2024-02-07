package filosofia.java.p269.my_interface.cycle_factory;

public class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }

}
