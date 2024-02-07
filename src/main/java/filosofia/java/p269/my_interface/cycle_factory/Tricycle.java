package filosofia.java.p269.my_interface.cycle_factory;

public class Tricycle implements Cycle{
    String model="Tricycle_Baby";
    int price = 7800;

    Tricycle (){}

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Tricycle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
