package filosofia.java.p269.my_interface.lots_interface;

public class Cat implements SomeHomeCat {
    private String name;
    private int age;
    private String address;

    public Cat(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
