package filosofia.java.p269.my_interface.cycle_factory;

public class Bicycle implements Cycle{
    String model="Bicycle_Friend";
    int price = 25000;
    int year = 2023;

    Bicycle (){}

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
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
