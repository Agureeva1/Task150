package filosofia.java.p269.my_interface.cycle_factory;

import static filosofia.java.p269.my_interface.cycle_factory.Factories.cycleMaker;
/* Создайте интерфейс Cycle с реализациями Bicycle, Unicycle, Tricycle.
* Создайте фабрику для каждой разновидности Cycle и код,
* использующий эти фабрики.
 */
public class Main {
    public static void main(String[] args) {
        cycleMaker(new BicycleFactory());
        cycleMaker(new UnicycleFactory());
        cycleMaker(new TricycleFactory());
    }
}
