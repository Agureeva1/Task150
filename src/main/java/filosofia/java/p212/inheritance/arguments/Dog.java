package filosofia.java.p212.inheritance.arguments;

public class Dog extends Animal {

    public Dog() {
        super(10);
        System.out.println("Я конструктор собаки по умолчанию");
    }
    public Dog(int i) {
        super(i);
        System.out.println("Я конструктор собаки с аргументом");
    }
}
