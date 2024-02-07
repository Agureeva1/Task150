package filosofia.java.p212.inheritance.arguments;

public class Cat extends Animal {
    private Plant plant = new Plant("Grass");
    public Cat() {
        super(12);
        System.out.println("Это конструктор класса кошка");
    }
}
