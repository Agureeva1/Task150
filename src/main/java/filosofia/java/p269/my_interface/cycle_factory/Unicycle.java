package filosofia.java.p269.my_interface.cycle_factory;

public class Unicycle implements Cycle{
    String model="Unicycle Best2000";
    int price = 15000;

    Unicycle() {}
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
        return "Unicycle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
